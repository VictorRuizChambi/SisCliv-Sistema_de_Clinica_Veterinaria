package com.servicio;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ICrudDAO;
import com.modelo.Cita;



@Service(value="citaService")
public class CitaServiceImpl implements CitaService{
	@Resource  
	private ICrudDAO<Cita> citaCrudDAO;

	@Override
	public void saveCita(Cita objCita) {
		citaCrudDAO.persist(objCita);	
	}	
}
