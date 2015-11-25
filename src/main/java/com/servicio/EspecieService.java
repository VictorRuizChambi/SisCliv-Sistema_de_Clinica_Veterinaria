package com.servicio;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.modelo.Especie;

@Transactional(propagation = Propagation.REQUIRED)
public interface EspecieService {

	public List<Especie> getEspecies();
	public Especie getEspecie(int eInEspeciePk);
	public void saveEspecie(Especie objEspecie);
	public void updateEspecie(Especie objEspecie);
	public void deleteEspecie(int eInEspeciePk);
}
