package co.com.documentalLabs.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.documentalLabs.dao.ModuloDao;
import co.com.documentalLabs.domain.Modulo;
import co.com.documentalLabs.service.ModuloService;

@Service
public class ModuloServiceImpl extends GenericServiceImpl<Modulo,Long> implements Serializable, ModuloService {

	private static final long serialVersionUID = 6400612977269447353L;

	@Autowired
	private ModuloDao moduloDao;
	
	@Autowired
	public ModuloServiceImpl(ModuloDao moduloDao) {
		this.setGenericDao(moduloDao);
	}

	public List<Modulo> findByPadre(Modulo modulo) {
		return moduloDao.findByPadre(modulo);
	}

}
