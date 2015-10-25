package com.servicio;

import java.util.List;

import javax.annotation.Resource;

import org.omg.CORBA.OBJECT_NOT_EXIST;
import org.springframework.stereotype.Service;

import com.dao.ICrudDAO;
import com.modelo.Mascota;
@Service(value="mascotaService")
public class MascotaServiceImpl implements MascotaService {


	@Resource  
	private ICrudDAO<Mascota> mascotaCrudDAO;
	
	@Override
	public List<Mascota> getMascotas() {

		return mascotaCrudDAO.findAll(Mascota.class);
	}

	@Override
	public Mascota getMascota(int cInMascotaPk) {

		return mascotaCrudDAO.findById(Mascota.class,cInMascotaPk);
	}

	@Override
	public void saveMascota(Mascota objMascota) {
		mascotaCrudDAO.persist(objMascota);
		
	}

	@Override
	public void updatetMascota(Mascota objMascota) {
		mascotaCrudDAO.persist(objMascota);
			
		
	}
	
	@Override
	public void deleteMascota(int cInMascotaPk) {
		
	}

}
