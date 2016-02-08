/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.documentalLabs.service.exception;

import java.io.Serializable;

/**
 *
 * @author Servio Pantoja
 */
public class ServiceException extends Exception implements Serializable{


	private static final long serialVersionUID = 8651949497748825971L;

	public ServiceException(String mensaje, Exception e){
		super(mensaje, e);
	}
	public ServiceException(String mensaje){
		super(mensaje);
	}

}
