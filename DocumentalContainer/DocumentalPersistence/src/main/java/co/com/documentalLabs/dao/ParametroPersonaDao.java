package co.com.documentalLabs.dao;

import java.util.List;

import co.com.documentalLabs.domain.ParametroPersona;
import co.com.documentalLabs.exception.PersistenceException;


public interface ParametroPersonaDao extends GenericDao<ParametroPersona,Long> {

	public List<ParametroPersona> findByTipo(Long idTipo)throws PersistenceException;
	
}
