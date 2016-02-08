package co.com.documentalLabs.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.documentalLabs.dao.GrupoDao;
import co.com.documentalLabs.domain.Grupo;
import co.com.documentalLabs.service.GrupoService;

@Service
public class GrupoServiceImpl extends GenericServiceImpl<Grupo,Long> implements GrupoService, Serializable {

	private static final long serialVersionUID = 8638893934358266592L;

	@Autowired
	public GrupoServiceImpl(GrupoDao grupoDao) {
		this.setGenericDao(grupoDao);
	}


}
