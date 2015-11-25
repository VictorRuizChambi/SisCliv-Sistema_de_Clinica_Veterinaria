package com.servicio;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ICrudDAO;
import com.modelo.Usuario;
@Service(value="usuarioService")
public class UserServiceImpl implements UserService {


	@Resource  
	private ICrudDAO<Usuario> usuarioCrudDAO;

	
	@Override
	public List<Usuario> getClientes() {
		
		List<Usuario> usuarios=usuarioCrudDAO.findAll(Usuario.class);
		return usuarios;
	}

	@Override
	public Usuario getUsuario(int uInUsuarioPk) {
//		System.out.println("Esta intentando traer un usuario");
		return usuarioCrudDAO.findById(Usuario.class,uInUsuarioPk);
	}

	@Override
	public void saveUsuario(Usuario objUsuario) {
		usuarioCrudDAO.persist(objUsuario);
		
	}



	@Override
	public void updatetUsuario(Usuario objUsuario) {
		usuarioCrudDAO.persist(objUsuario);
		
	}

	@Override
	public void deleteUsuario(int uInUsuarioPk) {
		
		Usuario miUsuario = usuarioCrudDAO.findById(Usuario.class,uInUsuarioPk);
		try {
			usuarioCrudDAO.delete(miUsuario);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
