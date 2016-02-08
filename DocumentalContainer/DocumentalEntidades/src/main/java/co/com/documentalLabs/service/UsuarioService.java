package co.com.documentalLabs.service;

import java.sql.SQLException;

import org.springframework.security.core.userdetails.UserDetails;

import co.com.documentalLabs.domain.Usuario;

public interface UsuarioService extends GenericService<Usuario,Long>  {

	Usuario iniciarSesion(String usuario, String password) throws SQLException ;
	
	UserDetails loadUserByUsername(String username) throws SQLException ;
}
