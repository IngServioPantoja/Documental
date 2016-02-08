package co.com.documentalLabs.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.documentalLabs.dao.RolDao;
import co.com.documentalLabs.domain.Rol;
import co.com.documentalLabs.service.RolService;

@Service
public class RolServiceImpl extends GenericServiceImpl<Rol,Long> implements Serializable, RolService {

	private static final long serialVersionUID = 1291988624242430482L;
	
	@Autowired
	public RolServiceImpl(RolDao rolDao) {
		this.setGenericDao(rolDao);
	}
	
}
