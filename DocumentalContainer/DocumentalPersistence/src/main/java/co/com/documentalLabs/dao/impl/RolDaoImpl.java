package co.com.documentalLabs.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.documentalLabs.dao.RolDao;
import co.com.documentalLabs.domain.Rol;

@Service
public class RolDaoImpl extends GenericDaoImpl<Rol,Long> implements RolDao,Serializable {

	private static final long serialVersionUID = 8687698728894900360L;

	@Autowired
	public RolDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	
}
