package mx.umb.dao;

import mx.umb.dao.exception.DaoException;
import mx.umb.model.dto.Puerto;

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
public interface PuertoDao extends GenericDao<Puerto, Integer> {
	Puerto findById(int id) throws DaoException;
	Puerto findByIdHql (int id) throws DaoException;
}
