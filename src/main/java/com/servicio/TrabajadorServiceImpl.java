package com.servicio;

import java.util.List;

import javax.annotation.Resource;

import org.omg.CORBA.OBJECT_NOT_EXIST;
import org.springframework.stereotype.Service;

import com.dao.ICrudDAO;
import com.modelo.Trabajador;
@Service(value="trabajadorService")
public class TrabajadorServiceImpl implements TrabajadorService {


	@Resource  
	private ICrudDAO<Trabajador> trabajadorCrudDAO;
	
	@Override
	public List<Trabajador> getTrabajadors() {

		return trabajadorCrudDAO.findAll(Trabajador.class);
	}

	@Override
	public Trabajador getTrabajador(int cInTrabajadorPk) {

		return trabajadorCrudDAO.findById(Trabajador.class,cInTrabajadorPk);
	}

	@Override
	public void saveTrabajador(Trabajador objTrabajador) {
		trabajadorCrudDAO.persist(objTrabajador);
		
	}

	@Override
	public void updatetTrabajador(Trabajador objTrabajador) {
		trabajadorCrudDAO.persist(objTrabajador);
			
		
	}
	
	@Override
	public void deleteTrabajador(int cInTrabajadorPk) {
		
	}

}
