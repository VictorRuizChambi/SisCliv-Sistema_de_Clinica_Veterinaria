package com.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

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
	public void deleteMascota(int mInMascotaPk) {
		Mascota objMascota = mascotaCrudDAO.findById(Mascota.class,mInMascotaPk);
		try {
			mascotaCrudDAO.delete(objMascota);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Object[]> getMascotaporHistorial(int hInHistorialPK) {

		
		String query1 = "Select * from mascota masc where masc.m_in_mascota_pk = "
				+ "(select historial.m_in_mascota_fk from historial where historial.h_in_historial_pk="+ hInHistorialPK  +" )";

		List<Object[]> lObj = mascotaCrudDAO.execQuery(query1);

		return lObj;
	}

	@Override
	public List<Object[]> getMascotaporNombre(String mStNombre) {

		String query1 = "Select * from mascota masc where masc.m_st_nombre = \""+ mStNombre  +"\"";

		List<Object[]> lObj = mascotaCrudDAO.execQuery(query1);

		return lObj;
	}

	@Override
	public List<Object[]> getMascotaporDniCliente(int cInDni) {

		String query1 = "Select * from mascota masc where masc.c_in_cliente_fk = "
				+ "(select cliente.c_in_cliente_pk from cliente where cliente.c_in_dni= "+ cInDni  +" )";

		List<Object[]> lObj = mascotaCrudDAO.execQuery(query1);

		return lObj;
	}
	

}
