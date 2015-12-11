package com.servicio;

import java.util.List;

import javax.servlet.ServletOutputStream;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.modelo.Mascota;

@Transactional(propagation = Propagation.REQUIRED)
public interface MascotaService {

	public List<Mascota> getMascotas();
	public Mascota getMascota(int cInMascotaPk);
	public void saveMascota(Mascota objMascota, int cInClientePk, int eInEspeciePk);
	public void updatetMascota(Mascota objMascota);
	public void deleteMascota(int cInMascotaPk);
	public List<Object[]> getMascotaporHistorial(int hInHistorialPK);
	public List<Object[]> getMascotaporNombre(String mStNombre);
	public List<Object[]> getMascotaporDniCliente(int cInDni);
}
