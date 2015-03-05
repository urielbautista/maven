package mx.umb.dao;

import mx.umb.dao.exception.DaoException;

/**
 * Copyright (c) 2015, UMB.
 * Descripción: Interface GenericDao
 *
 * Historial de Modificaciones:
 * Descripción del Cambio	: Creación
 * @author 					: umb 
 * @version 				: 1.0
 * Fecha					: 04/Marzo/2015
 * 
 */
public interface GenericDao<T,ID> {
	 /**
     * Busca entidades por el id.
     * @author umb.
     * @param id de la entidad a buscar.
     * @return Lista de entidades encontrados.
     * @throws DaoException del error en el dao.
     */
	T get(ID id) throws DaoException;
	 /**
     * Guarda o actualiza la entidad.
     * @author umb.
     * @param T Entidad a guardar o actualizar.
     * @return .
     * @throws DaoException del error en el dao.
     */
	void saveOrUpdate (T t) throws DaoException;
}
