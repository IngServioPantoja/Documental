package co.com.documentalLabs.service;

import co.com.documentalLabs.domain.Persona;
import co.com.documentalLabs.service.exception.ServiceException;

public interface PersonaService extends GenericService<Persona,Long> {
	boolean encontrarCedula(String cedula) throws ServiceException;

	Persona encontrarPorIdCompleta(Long idPersona) throws ServiceException;

}
