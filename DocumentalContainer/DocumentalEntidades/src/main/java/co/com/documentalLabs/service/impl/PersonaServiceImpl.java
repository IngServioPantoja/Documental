package co.com.documentalLabs.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.documentalLabs.dao.PersonaDao;
import co.com.documentalLabs.domain.Persona;
import co.com.documentalLabs.service.PersonaService;
import co.com.documentalLabs.service.exception.ServiceException;

@Service("personaService")
@Transactional
public class PersonaServiceImpl extends GenericServiceImpl<Persona,Long>  implements PersonaService {
	
	private static Logger log = Logger.getLogger(PersonaServiceImpl.class);
	
	private static final long serialVersionUID = 6641349706597372948L;

	@Autowired
	private PersonaDao personaDao;

	@Autowired
	public PersonaServiceImpl(PersonaDao personaDao) {
		this.setGenericDao(personaDao);
	}
	
	public boolean encontrarCedula(String cedula)throws ServiceException{
		System.out.println(cedula);
		try {
			log.debug("Consultando persona por cedula");
			return personaDao.encontrarCedula(cedula);
		} catch (Exception e) {
			log.debug("Capa Persistencia: Error Consultando persona por cedula "+e);
			throw new ServiceException("Capa Persistencia: Consultando persona por cedula",e);
		}
	}
	
	public Persona encontrarPorIdCompleta(Long idPersona) throws ServiceException{
		try {
			log.debug("Consultando persona por id y completa");
			return personaDao.encontrarPorIdCompleta(idPersona);
		} catch (Exception e) {
			log.debug("Capa Persistencia: Error Consultando persona por id y completa "+e);
			throw new ServiceException("Capa Persistencia: Consultando persona por id y completa",e);
		}
	}

}