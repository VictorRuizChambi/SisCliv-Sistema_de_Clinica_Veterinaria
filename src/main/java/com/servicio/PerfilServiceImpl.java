package com.servicio;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ICrudDAO;
import com.modelo.Cliente;
import com.modelo.Mascota;
import com.modelo.Perfil;
@Service(value="perfilService")
public class PerfilServiceImpl implements PerfilService {


	@Resource  
	private ICrudDAO<Perfil> perfilCrudDAO;

	
	@Override
	public List<Perfil> getPerfiles() {
		
		List<Perfil> perfiles=perfilCrudDAO.findAll(Perfil.class);
		return perfiles;
	}

	@Override
	public Perfil getPerfil(int pInPerfilPk) {
//		System.out.println("Esta intentando traer un cliente");
		return perfilCrudDAO.findById(Perfil.class,pInPerfilPk);
	}

	@Override
	public void savePerfil(Perfil objPerfil) {
		perfilCrudDAO.persist(objPerfil);
		
	}

	@Override
	public void updatetPerfil(Perfil objPerfil) {
		perfilCrudDAO.persist(objPerfil);
			
		
	}
	
	@Override
	public void deletePerfil(int pInPerfilPk) {
		
		Perfil miperfil = perfilCrudDAO.findById(Perfil.class,pInPerfilPk);
		try {
			perfilCrudDAO.delete(miperfil);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
