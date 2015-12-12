package com.servicio;

import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.modelo.Cliente;
import com.modelo.NombreCampo;
import com.modelo.ServicioMascota;
import com.modelo.ValorServicio;

@Transactional(propagation = Propagation.REQUIRED)
public interface ServicioMascotaService {

	
	
	public List<ServicioMascota> getServiciosMascota();
	public ServicioMascota getServicioMascota(int smInServicioMascotaPk);
	public void saveServicioMascota(ServicioMascota objServicioMascota);
	public void updateServicioMascota(ServicioMascota objServicioMascota);
	public void deleteServicioMascota(int smInServicioMascotaPk);
	public List<ServicioMascota> getServiciosPendientes(int smInAtendido,int	tInDni);
	public NombreCampo getNombrCampo(int ncInDetalleServicioPk);
	public void saveValorServicio(ValorServicio valorServicio1);
}
