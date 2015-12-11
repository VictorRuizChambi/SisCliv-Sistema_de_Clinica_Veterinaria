package com.servicio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ICrudDAO;
import com.modelo.Usuario;
import com.recursos.SQLConstants.SQLUsuario;
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

	@Override
	public Usuario getUsuarioporDni(int uInDni) {
		Map<String,Object> parameters=new HashMap<String, Object>();
		parameters.put("uInDni", uInDni);
		return (usuarioCrudDAO.findByNamedQuery(SQLUsuario.QUERY_FIND_USER_BY_DNI, parameters)).get(0);

	}

	@Override
	public Usuario verificaUsuario(int uInDni,String uStContrasena)
	{
		
		Map<String, Object> objMap = new HashMap<String, Object>();
		
		objMap.put("uInDni",uInDni);
		objMap.put("uStContrasena",uStContrasena);
		List<Usuario> usuarioList=usuarioCrudDAO.findByNamedQuery(SQLUsuario.QUERY_VERIFICA_USUARIO, objMap);
		for (Usuario usuario2 : usuarioList) {
			System.out.println("Usuario"+usuario2.getUInDni());
		}
		System.out.println("Longitud de usuarios-> "+usuarioList.size());
		if(usuarioList.size()==1)				
			return usuarioList.get(0);
		else
			return null;		
	}
}
