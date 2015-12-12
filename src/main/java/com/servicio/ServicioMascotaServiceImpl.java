package com.servicio;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ICrudDAO;
import com.modelo.NombreCampo;
import com.modelo.ServicioMascota;
import com.modelo.ValorServicio;
import com.recursos.SQLConstants.SQLServicioMascota;

@Service(value="serviciomascotaService")
public class ServicioMascotaServiceImpl implements ServicioMascotaService {

	@Resource  
	private ICrudDAO<ServicioMascota> servicioMascotaCrudDAO;
	
	@Resource  
	private ICrudDAO<NombreCampo> nombreCampoCrudDAO;
	
	@Resource  
	private ICrudDAO<ValorServicio> valorServicioCrudDAO;
	
	public void saveValorServicio(ValorServicio valorServicio1){
		valorServicioCrudDAO.persist(valorServicio1);
	}
	
	@Override
	public List<ServicioMascota> getServiciosMascota() {
		List<ServicioMascota> servicioMascotas=servicioMascotaCrudDAO.findAll(ServicioMascota.class);
		return servicioMascotas;
	}

	@Override
	public ServicioMascota getServicioMascota(int smInServicioMascotaPk) {
		return servicioMascotaCrudDAO.findById(ServicioMascota.class,smInServicioMascotaPk);

	}
	
	@Override
	public NombreCampo getNombrCampo(int ncInDetalleServicioPk) {
		return nombreCampoCrudDAO.findById(NombreCampo.class,ncInDetalleServicioPk);

	}
	
	@Override
	public void saveServicioMascota(ServicioMascota objServicioMascota) {
		servicioMascotaCrudDAO.persist(objServicioMascota);
		
	}

	@Override
	public void updateServicioMascota(ServicioMascota objServicioMascota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteServicioMascota(int smInServicioMascotaPk) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<ServicioMascota> getServiciosPendientes(int smInAtendido,int	tInDni) {
		Map<String, Object> parameters=new HashMap<String, Object>(); 
		parameters.put("smInAtendido", smInAtendido);
		parameters.put("tInDni", tInDni);
		System.out.println("ATENDIDO"+smInAtendido);

		System.out.println("DNI"+tInDni);
		List<ServicioMascota> servicios=servicioMascotaCrudDAO.findByNamedQuery(SQLServicioMascota.QUERY_FIND_CONSULTA_ATENDIDO_DAY, parameters);
		if (servicios!=null) {
			for (ServicioMascota servicioMascota : servicios) {
				System.out.println("CAMPOS DE LOS SERVICIOS"+servicioMascota.getSmInServicioMascotaPk());;
			}
		}
		
		return servicios;
				
	}
	

}
