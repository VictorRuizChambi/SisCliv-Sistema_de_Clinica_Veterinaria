package com.controlador;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.modelo.Cliente;
import com.modelo.Mascota;
import com.recursos.AnnotationExclusionStrategy;
import com.servicio.ClienteService;
import com.servicio.MascotaService;

@Controller
public class ClienteController {
//	@Autowired
//	ClienteService clienteService;
//	@Autowired
//	MascotaService mascotaService;
//	
//
//	@RequestMapping(value="/getClientes", method = RequestMethod.GET , produces = "application/json;charset=UTF-8")
//	public @ResponseBody String getClientes() throws Exception{
//		List<Cliente> clientes = clienteService.getClientes(); 		
//		String jsonResponse= null;
//		final Gson gson = new GsonBuilder().setExclusionStrategies(new AnnotationExclusionStrategy()).create();
//		jsonResponse = gson.toJson(clientes);
//		System.out.println("CLIENTE: \n"+jsonResponse);
//		return jsonResponse;
//		
//	}	
//	
//
//	@RequestMapping(value="/getMascotas", method = RequestMethod.GET , produces = "application/json;charset=UTF-8")
//	public @ResponseBody String getMascotas() throws Exception{
//			
//		List<Mascota> mascotas = mascotaService.getMascotas(); 
//		String jsonResponse2= null;
//		final Gson gson2 = new GsonBuilder().setExclusionStrategies(new AnnotationExclusionStrategy()).create();
//		jsonResponse2 = gson2.toJson(mascotas);
//		System.out.println("MASCOTA: \n"+jsonResponse2);
//		return jsonResponse2;
//		
//	}		
//	
//	@RequestMapping(value="/getCliente", method = RequestMethod.GET , produces = "application/json;charset=UTF-8")
//	public @ResponseBody String getCliente(@RequestParam int codigo) throws Exception{
//		Cliente cliente = clienteService.getCliente(codigo); 
//		Gson objGson = new Gson();
//		return objGson.toJson(cliente);
//	}
//	
//	
//	@RequestMapping(value="/saveCliente", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
//	public @ResponseBody void saveSystemParameters(@RequestParam String sexo,@RequestParam Date fechaNacimiento,@RequestParam Integer dni,@RequestParam String  apellidoMaterno,@RequestParam String  apellidoPaterno,@RequestParam String  direccion,@RequestParam String  correo,@RequestParam String  nombres){
//		
//		
//		Cliente objCliente=new Cliente();
//		objCliente.setCChSexo(sexo);
//		objCliente.setCDtFechaNacimiento(fechaNacimiento);;
//		objCliente.setCInDni(dni);
//		objCliente.setCInStatus(1);
//		objCliente.setCStApellidoMaterno(apellidoMaterno);
//		objCliente.setCStApellidoPaterno(apellidoPaterno);
//		objCliente.setCStCorreo(correo);
//		objCliente.setCStDireccion(direccion);
//		objCliente.setCStNombres(nombres);
//		System.out.println("aun no se guarda ");
//		clienteService.saveCliente(objCliente);
//		System.out.println("se ha guardado java");
//	}
	
	  @RequestMapping(value = "/")
	  public String principal() {
	    return "Inicio";
	  }
	  
	  @RequestMapping(value = "/Inicio")
	  public String inicio() {
	    return "Inicio";
	  } 
	  @RequestMapping(value = "/Recepcionista")
	  public String recepcionista() {
	    return "Recepcionista";
	  } 
	  
}
