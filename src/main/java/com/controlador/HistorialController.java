package com.controlador;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.modelo.Cliente;
import com.modelo.Historial;
import com.modelo.ServicioMascota;
import com.modelo.Usuario;
import com.recursos.AnnotationExclusionStrategy;
import com.servicio.CitaService;
import com.servicio.ClienteService;
import com.servicio.HistorialService;
@Controller
public class HistorialController {
	@Autowired
	CitaService citaService;
	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	HistorialService historialService;
	
	@RequestMapping(value = "/Historial")
	public String getReservarCita(){
		return "HistorialC1";
	}	
	@RequestMapping(value = "/VerHistorial", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public @ResponseBody String VerHistorial(Model modelo,HttpServletRequest req) throws Exception {
		
		Gson objGson = new Gson();		
		return objGson.toJson("error");		
	}
	
	
	@RequestMapping(value = "/getDetalleHistorial", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public @ResponseBody String getDetalleHistorial(Model modelo,HttpServletRequest req) throws Exception {
		Usuario c = (Usuario) req.getSession().getAttribute("usuario");						
		
		Gson objGson = new Gson();		
		Cliente cliente=clienteService.getClienteByUsuarioPk(c.getUInUsuarioPk());
		
		if(cliente!=null)			
		return objGson.toJson(cliente.getCStNombres());
		else
		return objGson.toJson("No es un cliente");
		
	}		
	@RequestMapping(value="/getHistorial", method = RequestMethod.GET , produces = "application/json;charset=UTF-8")
	public @ResponseBody String getClientes(HttpServletRequest req) throws Exception{
		//List<Cliente> clientes = clienteService.getClientes();
		Usuario c = (Usuario) req.getSession().getAttribute("usuario");
		
		System.out.println("paso por get historial");
		List<Historial> historial = historialService.getHistoriales();
		
		
		List<ServicioMascota> servicioMascotaList=historialService.getServiciosMascota(c.getUInUsuarioPk());
		//List<ServicioMascota> servicioMascotaList=historialService.getServiciosMascota(2);
		System.out.println("imprimiendo servicioMascota");
		for(int i=0;i<servicioMascotaList.size();i++){			
			System.out.println("CLIENTE: "+ servicioMascotaList.get(i).getHistorial().getMascota().getMStNombre());
		}
		
		String jsonResponse= null;
		final Gson gson = new GsonBuilder().setExclusionStrategies(new AnnotationExclusionStrategy()).create();
		//jsonResponse = gson.toJson(clientes);
		//jsonResponse = gson.toJson(historial);
		jsonResponse = gson.toJson(servicioMascotaList);
		
		System.out.println("CLIENTE: \n"+jsonResponse);		
		/*
		for(int i=0;i<clientes.size();i++){
			System.out.println("CLIENTE: "+ clientes.get(i).getCStNombres() + " identificador: " + clientes.get(i).getCInClientePk() +" \n");
		}
		*/		
		return jsonResponse;		
	}	
}
