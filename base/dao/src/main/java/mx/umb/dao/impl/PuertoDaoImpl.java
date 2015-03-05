package mx.umb.dao.impl;


import mx.umb.dao.PuertoDao;
import mx.umb.dao.exception.DaoException;
import mx.umb.model.dto.Puerto;

import org.hibernate.QueryException;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (c) 2015, UMB.
 * Descripción: Implementación PuertoDao
 *
 * Historial de Modificaciones:
 * Descripción del Cambio	: Creación
 * @author 					: umb 
 * @version 				: 1.0
 * Fecha					: 04/Marzo/2015
 * 
 */
public class PuertoDaoImpl extends GenericDaoImpl<Puerto, Integer> implements PuertoDao {
	private static Logger logger = LoggerFactory.getLogger(PuertoDaoImpl.class);
	
	@Override
	protected Class<Puerto> getClazz() {
		return Puerto.class;
	}

	public Puerto findById(int id) throws DaoException {
		try {
			logger.debug("findByIdJPuerto");
			return (Puerto) getCurrentSession().createCriteria(getClazz())
			.add(Restrictions.eq("id", id))
			.addOrder(Order.asc("id")).list().get(0);
		} catch (QueryException e) {
			logger.error("Error al obtener la entidad {} por el id: {}", getClazz().getName(),id);
			throw new DaoException(	"Error al tratar de buscar la entidad por su identificador.", e);
		}
	}

	public Puerto findByIdHql(int id) throws DaoException {
		try {
			logger.debug("findByIdJPuerto");
			return (Puerto) getCurrentSession().createQuery("from Puerto where id = :id ")
				.setParameter("id", id).list().get(0);
		} catch (QueryException e) {
			logger.error("Error al obtener la entidad {} por el id: {}", getClazz().getName(),id);
			throw new DaoException(	"Error al tratar de buscar la entidad por su identificador.", e);
		}
	}
	
}