package com.servicio;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.modelo.Mascota;

@Transactional(propagation = Propagation.REQUIRED)
public interface MascotaService {

	public List<Mascota> getMascotas();
	public Mascota getMascota(int cInMascotaPk);
	public void saveMascota(Mascota objMascota);
	public void updatetMascota(Mascota objMascota);
	public void deleteMascota(int cInMascotaPk);
}
