package co.com.documentalLabs.service;

import java.util.List;

import co.com.documentalLabs.domain.ParametroPersona;
import co.com.documentalLabs.service.exception.ServiceException;

public interface ParametroPersonaService extends GenericService<ParametroPersona,Long>{
	
	public List<ParametroPersona> findByTipo(Long idTipo)throws ServiceException;
	
}
