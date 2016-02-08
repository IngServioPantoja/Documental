package co.com.documentalLabs.dao;

import java.sql.SQLException;
import java.util.List;

import co.com.documentalLabs.domain.ModuloOpcion;
import co.com.documentalLabs.domain.Rol;

public interface ModuloOpcionDao extends GenericDao<ModuloOpcion,Long>{

	public List<ModuloOpcion> findByRol(Rol rol)throws SQLException;
}
