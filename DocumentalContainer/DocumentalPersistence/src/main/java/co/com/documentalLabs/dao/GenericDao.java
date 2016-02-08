package co.com.documentalLabs.dao;

import java.util.List;

import co.com.documentalLabs.exception.PersistenceException;

public interface GenericDao<T,ID> {
	
	T insertar(T t)throws PersistenceException;

    void eliminar(T t)throws PersistenceException;

    T encontrarPorId(ID id)throws PersistenceException;

    T actualizar(T t)throws PersistenceException;  

    List<T> listar()throws PersistenceException;  
}
