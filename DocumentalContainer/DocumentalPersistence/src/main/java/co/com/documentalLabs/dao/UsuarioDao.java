package co.com.documentalLabs.dao;

import java.sql.SQLException;

import co.com.documentalLabs.domain.Usuario;

public interface UsuarioDao extends GenericDao<Usuario,Long> {

	/**
	 * @author ServioAndres
	 * @Return Usuario con datos de la cuenta en caso de exitir o sin datos en caso erroneo
	 */
	Usuario iniciarSesion(String usuario, String contrasena)throws SQLException;
	
	Usuario findByUserName(String username)throws SQLException;
}
