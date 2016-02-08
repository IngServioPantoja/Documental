package co.com.documentalLabs.service;

import java.sql.SQLException;
import java.util.List;

import co.com.documentalLabs.domain.ModuloOpcion;
import co.com.documentalLabs.domain.Rol;

public interface ModuloOpcionService extends GenericService<ModuloOpcion,Long> {
	
	public List<ModuloOpcion> findByRol(Rol rol)throws SQLException;
}
