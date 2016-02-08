package co.com.documentalLabs.dao;

import co.com.documentalLabs.domain.Persona;
import co.com.documentalLabs.exception.PersistenceException;

public interface PersonaDao extends GenericDao<Persona,Long> {
	
	long contadorPersonas();

	Persona getPersonaByEmail(Persona persona);
	
	boolean encontrarCedula(String cedula)throws PersistenceException;

	Persona encontrarPorIdCompleta(Long idPersona)throws PersistenceException;
}
