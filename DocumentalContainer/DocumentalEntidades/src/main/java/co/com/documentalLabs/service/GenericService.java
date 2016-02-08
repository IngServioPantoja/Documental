package co.com.documentalLabs.service;

import java.util.List;

import co.com.documentalLabs.service.exception.ServiceException;

public interface GenericService<T,ID> {

    List<T> listar()throws ServiceException; 

    T insertar(T t)throws ServiceException; 

    T encontrarPorId(ID id)throws ServiceException; 

    T actualizar(T t)throws ServiceException;   

    void eliminar(T t)throws ServiceException; 
}
