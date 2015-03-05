package mx.umb.dao.impl;

import java.io.Serializable;

import mx.umb.dao.GenericDao;
import mx.umb.dao.exception.DaoException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (c) 2015, UMB.
 * Descripción: Implementación GenericDao
 *
 * Historial de Modificaciones:
 * Descripción del Cambio	: Creación
 * @author 					: umb 
 * @version 				: 1.0
 * Fecha					: 04/Marzo/2015
 * 
 */
public abstract class GenericDaoImpl<T extends Serializable, ID extends Serializable> implements GenericDao<T,ID> {
	private static Logger logger = LoggerFactory.getLogger( GenericDaoImpl.class );
	private SessionFactory sessionFactory;
	
	protected Class<T> clazz = getClazz();

	/**
	 * Obtiene el tipo de la entidad persistente.
	 *
	 * @return El tipo de la entidad persistente.
	 */
	protected abstract Class<T> getClazz();


	@SuppressWarnings("unchecked")
	public T get(ID id) throws DaoException {
		try {
			logger.debug( "Obteniendo una entidad del tipo {} con el id {}", getClazz().getName(), id );
			return (T) getCurrentSession().get(getClazz(), id);
		} catch (HibernateException e) {
			logger.error( "No se pudo realizar la consulta para el tipo {} con el id {}", getClazz().getName(), id );
			logger.error( "No se pudo obtener.", e );
			throw new DaoException(	"Error al tratar de buscar la entidad por su identificador." );
		}
    }

	public void saveOrUpdate (T t)throws DaoException {
		try {
			logger.info( "Guardando o actualizado la entidad ", getClazz().getName());
			getCurrentSession().saveOrUpdate(t);
		} catch (HibernateException e) {
			logger.error( "No se pudo guardar o actualizar la entidad {}", getClazz().getName());
			logger.error( "No se pudo guardar o actualizar.", e );
			throw new DaoException(	"Error al guardar o actualizar la entidad." );
		}
    }
	
	protected final Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	/****************************************************************************************************/
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}