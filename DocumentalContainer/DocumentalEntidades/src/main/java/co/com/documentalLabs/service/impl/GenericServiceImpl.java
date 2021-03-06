package co.com.documentalLabs.service.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.documentalLabs.dao.GenericDao;
import co.com.documentalLabs.exception.PersistenceException;
import co.com.documentalLabs.service.GenericService;
import co.com.documentalLabs.service.exception.ServiceException;

@Service
@Transactional(rollbackFor=ServiceException.class)
public abstract class GenericServiceImpl<T,ID> implements Serializable, GenericService<T,ID> {

	private static Logger log = Logger.getLogger(GenericServiceImpl.class);

	private static final long serialVersionUID = 5213654477241088294L;

	private GenericDao<T,ID> genericDao;

	public List<T> listar() throws ServiceException {
		try {
			log.debug("Consultando listados");
			return genericDao.listar();
		} catch (PersistenceException e) {
			log.debug("Capa de servicio: Error al consultar listados", e);
			throw new ServiceException("Capa de servicio: Error al consultar listados", e);
		}
	}

	public T insertar(T t) throws ServiceException {
		try {
			log.debug("Registrando entidad");
			System.out.println("Registrando entidad");
			genericDao.insertar(t);
			return genericDao.insertar(t);
		} catch (PersistenceException e) {
			log.debug("Capa de servicio: Error Registrando entidad", e);
			throw new ServiceException("Capa de servicio: Error Registrando entidad", e);
		}
	}

	public T encontrarPorId(ID id) throws ServiceException {
		try {
			log.debug("Consultando entidad por id");
			return genericDao.encontrarPorId(id);
		} catch (PersistenceException e) {
			log.debug("Capa de servicio: Error Consultando entidad por id", e);
			throw new ServiceException("Capa de servicio: Error Consultando entidad por id", e);
		}
	}

	public T actualizar(T t) throws ServiceException {
		try {
			log.debug("Actualizando entidad");
			return genericDao.actualizar(t);
		} catch (PersistenceException e) {
			log.debug("Capa de servicio: Error Actualizando entidad", e);
			throw new ServiceException("Capa de servicio: Error Actualizando entidad", e);
		}
	}

	public void eliminar(T t) throws ServiceException {
		try {
			log.debug("Eliminando entidad");
			this.genericDao.eliminar(t);
		} catch (PersistenceException e) {
			log.debug("Capa de servicio: Error Eliminando entidad", e);
			throw new ServiceException("Capa de servicio: Error Eliminando entidad", e);
		}
	}

	protected void setGenericDao(GenericDao genericDao) {
		this.genericDao = genericDao;
	}

	public GenericDao getGenericDao() {
		return genericDao;
	}

}
