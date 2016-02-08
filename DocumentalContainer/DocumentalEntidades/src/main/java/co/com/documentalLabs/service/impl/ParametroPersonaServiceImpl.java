package co.com.documentalLabs.service.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.documentalLabs.dao.ParametroPersonaDao;
import co.com.documentalLabs.domain.ParametroPersona;
import co.com.documentalLabs.exception.PersistenceException;
import co.com.documentalLabs.service.ParametroPersonaService;
import co.com.documentalLabs.service.exception.ServiceException;

@Service
@Transactional
public class ParametroPersonaServiceImpl extends GenericServiceImpl<ParametroPersona,Long> implements Serializable, ParametroPersonaService {
	
	private static Logger log = Logger.getLogger(ParametroPersonaServiceImpl.class);
	
	private static final long serialVersionUID = 853093025615386971L;

	@Autowired
	private ParametroPersonaDao parametroPersonaDao;
	
	@Autowired
	public ParametroPersonaServiceImpl(ParametroPersonaDao parametroPersonaDao) {
		this.setGenericDao(parametroPersonaDao);
	}

	public List<ParametroPersona> findByTipo(Long idTipo)throws ServiceException {
		try {
			log.debug("Consultando parametros por tipo");
			return parametroPersonaDao.findByTipo(idTipo);
		} catch (PersistenceException e) {
			log.debug("Capa de servicio: Error Consultando parametros por tipo", e);
			throw new ServiceException("Capa de servicio: Error Consultando parametros por tipo", e);
		}
	}

}
