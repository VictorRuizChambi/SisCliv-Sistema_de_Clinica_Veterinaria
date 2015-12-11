package com.servicio;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.modelo.Trabajador;

@Transactional(propagation = Propagation.REQUIRED)
public interface TrabajadorService {

	public List<Trabajador> getTrabajadors();
	public Trabajador getTrabajador(int cInTrabajadorPk);
	public void saveTrabajador(Trabajador objTrabajador);
	public void updatetTrabajador(Trabajador objTrabajador);
	public void deleteTrabajador(int cInTrabajadorPk);
}
