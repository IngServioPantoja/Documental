package co.com.documentalLabs.service;

import java.util.List;

import co.com.documentalLabs.domain.Modulo;

public interface ModuloService extends GenericService<Modulo,Long> {
	
	public List<Modulo> findByPadre(Modulo modulo);
}
