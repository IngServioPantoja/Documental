package co.com.documentalLabs.service.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.documentalLabs.dao.ModuloOpcionDao;
import co.com.documentalLabs.domain.ModuloOpcion;
import co.com.documentalLabs.domain.Rol;
import co.com.documentalLabs.service.ModuloOpcionService;

@Service
public class ModuloOpcionServiceImpl extends GenericServiceImpl<ModuloOpcion,Long>  implements Serializable, ModuloOpcionService {

	private static final long serialVersionUID = 6091732389977597476L;

	@Autowired
	private ModuloOpcionDao moduloOpcionDao;
	
	@Autowired
	public ModuloOpcionServiceImpl(ModuloOpcionDao moduloOpcionDao) {
		this.setGenericDao(moduloOpcionDao);
	}

	public List<ModuloOpcion> findByRol(Rol rol)throws SQLException {
		return moduloOpcionDao.findByRol(rol);
	}
}
