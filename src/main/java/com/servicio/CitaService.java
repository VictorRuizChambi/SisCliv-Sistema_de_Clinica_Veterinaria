package com.servicio;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.modelo.Cita;

@Transactional(propagation = Propagation.REQUIRED)
public interface CitaService {
	public void saveCita(Cita objCita);
}
