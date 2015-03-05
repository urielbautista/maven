package mx.umb.service.impl;

import mx.umb.dao.PuertoDao;
import mx.umb.dao.exception.DaoException;
import mx.umb.model.dto.Puerto;
import mx.umb.service.PuertoService;
import mx.umb.service.exception.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PuertoServiceImpl implements PuertoService {
	private static Logger logger = LoggerFactory.getLogger(PuertoServiceImpl.class );
	private PuertoDao puertoDao;
	
	public Puerto findBy() throws ServiceException {
		System.out.println("Esto es una prueba de servicio");
		return null;
	}
	
	public void saveOrUpdate(Puerto puerto) throws ServiceException {
		try {
			puertoDao.saveOrUpdate(puerto);
		} catch (DaoException e) {
			logger.error( "No se pudo guardar o actualizar la entidad {}", puerto.getClass());
			logger.error( "No se pudo guardar o actualizar.", e );
			throw new ServiceException(	"Error al guardar o actualizar la entidad." );
		}	
	}
	
	/****************************************************************************************************/
	public PuertoDao getPuertoDao() {
		return puertoDao;
	}

	public void setPuertoDao(PuertoDao puertoDao) {
		this.puertoDao = puertoDao;
	}
}