package co.com.documentalLabs.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.documentalLabs.dao.GrupoDao;
import co.com.documentalLabs.domain.Grupo;

@Repository
public class GrupoDaoImpl extends GenericDaoImpl<Grupo,Long> implements GrupoDao, Serializable {

	private static final long serialVersionUID = -2477192798003721698L;

	@Autowired
	public GrupoDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
