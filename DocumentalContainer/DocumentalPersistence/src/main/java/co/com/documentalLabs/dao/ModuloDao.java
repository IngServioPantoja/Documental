package co.com.documentalLabs.dao;

import java.util.List;

import co.com.documentalLabs.domain.Modulo;

public interface ModuloDao extends GenericDao<Modulo,Long> {
	
	public List<Modulo> findByPadre(Modulo modulo);
}
