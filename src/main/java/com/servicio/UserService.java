package com.servicio;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.modelo.Usuario;

@Transactional(propagation = Propagation.REQUIRED)
public interface UserService {

	public List<Usuario> getClientes();
	public Usuario getUsuario(int uInUsuarioPk);
	public Usuario getUsuarioporDni(int uInUsuarioDni);
	public void saveUsuario(Usuario objUsuario);
	public void updatetUsuario(Usuario objUsuario);
	public void deleteUsuario(int uInUsuarioPk);
	public Usuario verificaUsuario(int uInDni,String uStContrasena);
}
