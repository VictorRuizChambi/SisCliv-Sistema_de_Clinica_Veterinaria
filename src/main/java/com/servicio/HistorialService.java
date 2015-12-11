package com.servicio;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.modelo.Historial;
import com.modelo.ServicioMascota;

@Transactional(propagation = Propagation.REQUIRED)
public interface HistorialService {

	public List<Historial> getHistoriales();
	public Historial getHistorial(int hInHistorialPk);
	List<ServicioMascota> getServiciosMascota(int cInClientePk);
//	public void saveMascota(Mascota objMascota, int cInClientePk, int eInEspeciePk);
//	public void updatetMascota(Mascota objMascota);
//	public void deleteMascota(int cInMascotaPk);
//	public List<Object[]> getMascotaporHistorial(int hInHistorialPK);
//	public List<Object[]> getMascotaporNombre(String mStNombre);
//	public List<Object[]> getMascotaporDniCliente(int cInDni);
}
