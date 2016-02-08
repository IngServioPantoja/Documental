package co.com.documentalLabs.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.documentalLabs.dao.TipoParametroPersonaDao;
import co.com.documentalLabs.domain.TipoParametroPersona;

public class TipoParametroPersonaDaoImpl extends GenericDaoImpl<TipoParametroPersona,Long> implements TipoParametroPersonaDao, Serializable {
	

	private static final long serialVersionUID = -438777477023653218L;
	
	@Autowired
	public TipoParametroPersonaDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}
}
