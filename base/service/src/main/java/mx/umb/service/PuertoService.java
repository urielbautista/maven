package mx.umb.service;

import mx.umb.model.dto.Puerto;
import mx.umb.service.exception.ServiceException;


/**
 * Copyright (c) 2015, UMB.
 * Descripción: Interface PuertoService
 *
 * Historial de Modificaciones:
 * Descripción del Cambio	: Creación
 * @author 					: umb 
 * @version 				: 1.0
 * Fecha					: 04/Marzo/2015
 * 
 */
public interface PuertoService {
	
	 /**
     * Busca entidades por ....
     * @author umb.
     * @param id de la entidad a buscar.
     * @return Lista de entidades encontrados.
     * @throws ServiceException del error en el service.
     */

	Puerto findBy() throws ServiceException;
	
	 /**
     * Guarda o actualiza la entidad.
     * @author umb.
     * @param Puerto la entidad a guardar o actualizar.
     * @return .
     * @throws ServiceException del error en el service.
     */
	void saveOrUpdate (Puerto puerto) throws ServiceException;

}
