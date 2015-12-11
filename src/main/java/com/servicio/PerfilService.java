package com.servicio;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.modelo.Perfil;

@Transactional(propagation = Propagation.REQUIRED)
public interface PerfilService {

	public List<Perfil> getPerfiles();
	public Perfil getPerfil(int cInClientePk);
	public void savePerfil(Perfil objPerfil);
	public void updatetPerfil(Perfil objPerfil);
	public void deletePerfil(int pInPerfilPk);
}
