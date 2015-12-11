package com.servicio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ICrudDAO;
import com.modelo.Historial;
import com.modelo.ServicioMascota;
import com.recursos.SQLConstants.SQLSHistorial;


@Service(value="historialService")
public class HistorialServiceImpl implements HistorialService {


	@Resource  
	private ICrudDAO<Historial> historialCrudDAO;
	
	@Resource  
	private ICrudDAO<ServicioMascota> servicioMascotaCrudDAO;

	
	@Override
	public List<Historial> getHistoriales() {

		List<Historial> historiales=historialCrudDAO.findAll(Historial.class);
		return historiales;	
	}

	@Override
	public Historial getHistorial(int hInHistorialPk) {

		return historialCrudDAO.findById(Historial.class,hInHistorialPk);
	}

	@Override
	public List<ServicioMascota> getServiciosMascota(int uInUsuarioPk) {		
		Map<String, Object> objMap = new HashMap<String, Object>();		
		objMap.put("uInUsuarioPk",uInUsuarioPk);		
		List<ServicioMascota> servicioMascotaList=servicioMascotaCrudDAO.findByNamedQuery(SQLSHistorial.QUERY_FIND_SERVICIOMASCOTA_BY_USUARIOPK, objMap);		
		return servicioMascotaList;				
	}
//	@Override
//	public void saveMascota(Mascota objMascota, int cInClientePk, int eInEspeciePk) {
//		
//		Cliente objCliente=clienteService.getCliente(cInClientePk);
//		objMascota.setCliente(objCliente);
//		objMascota.setEspecie(especieService.getEspecie(eInEspeciePk));
//		objMascota.setMStApellidoMaterno(objCliente.getCStApellidoMaterno());
//		objMascota.setMStApellidoPaterno(objCliente.getCStApellidoPaterno());
//		objMascota.setHistorial(historialDAO.findById(Historial.class, 1));
//		mascotaCrudDAO.persist(objMascota);
//		
//	}
//
//	@Override
//	public void updatetMascota(Mascota objMascota) {
//		mascotaCrudDAO.persist(objMascota);
//			
//		
//	}
//	
//	@Override
//	public void deleteMascota(int mInMascotaPk) {
//		
//		System.out.println("ESTOY ELIMINANDO");
//		Mascota objMascota = mascotaCrudDAO.findById(Mascota.class,mInMascotaPk);
//		Map<String,Object> parameters=new HashMap<String,Object>();
//		parameters.put("mInMascotaPk",mInMascotaPk);
//		mascotaCrudDAO.executeUpdateNamedQuery(SQLMascota.QUERY_DELETE_BY_MASCOTA_PK, parameters);
//		
//	}
//
//	@Override
//	public List<Object[]> getMascotaporHistorial(int hInHistorialPK) {
//
//		
//		String query1 = "Select * from mascota masc where masc.m_in_mascota_pk = "
//				+ "(select historial.m_in_mascota_fk from historial where historial.h_in_historial_pk="+ hInHistorialPK  +" )";
//
//		List<Object[]> lObj = mascotaCrudDAO.execQuery(query1);
//
//		return lObj;
//	}
//
//	@Override
//	public List<Object[]> getMascotaporNombre(String mStNombre) {
//
//		String query1 = "Select * from mascota masc where masc.m_st_nombre = \""+ mStNombre  +"\"";
//
//		List<Object[]> lObj = mascotaCrudDAO.execQuery(query1);
//
//		return lObj;
//	}
//
//	@Override
//	public List<Object[]> getMascotaporDniCliente(int cInDni) {
//
//		String query1 = "Select * from mascota masc where masc.c_in_cliente_fk = "
//				+ "(select cliente.c_in_cliente_pk from cliente where cliente.c_in_dni= "+ cInDni  +" )";
//
//		List<Object[]> lObj = mascotaCrudDAO.execQuery(query1);
//
//		return lObj;
//	}
//	

}
