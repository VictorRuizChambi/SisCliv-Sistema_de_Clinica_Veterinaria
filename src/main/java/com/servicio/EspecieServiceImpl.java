package com.servicio;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ICrudDAO;
import com.modelo.Especie;
@Service(value="especieService")
public class EspecieServiceImpl implements EspecieService {


	@Resource  
	private ICrudDAO<Especie> especieCrudDAO;

	
	@Override
	public List<Especie> getEspecies() {
		
		List<Especie> especies=especieCrudDAO.findAll(Especie.class);
		return especies;
	}

	@Override
	public Especie getEspecie(int eInEspeciePk) {
//		System.out.println("Esta intentando traer un usuario");
		return especieCrudDAO.findById(Especie.class,eInEspeciePk);
	}

	@Override
	public void saveEspecie(Especie objEspecie) {
		especieCrudDAO.persist(objEspecie);
		
	}



	@Override
	public void updateEspecie(Especie objEspecie) {
		especieCrudDAO.persist(objEspecie);
		
	}

	@Override
	public void deleteEspecie(int eInEspeciePk) {
		
		Especie miEspecie = especieCrudDAO.findById(Especie.class,eInEspeciePk);
		try {
			especieCrudDAO.delete(miEspecie);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
