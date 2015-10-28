package com.controlador;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.modelo.Cliente;
import com.recursos.AnnotationExclusionStrategy;
import com.servicio.ClienteService;

@Controller
public class ClienteController {
	@Autowired
	ClienteService clienteService;
	

	@RequestMapping(value="/getClientes", method = RequestMethod.GET , produces = "application/json;charset=UTF-8")
	public @ResponseBody String getClientes() throws Exception{
		List<Cliente> clientes = clienteService.getClientes(); 	
		String jsonResponse= null;
		System.out.println(clientes.get(0).getCInDni());
		final Gson gson = new GsonBuilder().setExclusionStrategies(new AnnotationExclusionStrategy()).create();
		jsonResponse = gson.toJson(clientes);
		return jsonResponse;
		
	}	
	
	@RequestMapping(value="/getCliente", method = RequestMethod.GET , produces = "application/json;charset=UTF-8")
	public @ResponseBody String getCliente(@RequestParam int codigo) throws Exception{
		Cliente cliente = clienteService.getCliente(codigo); 
		Gson objGson = new Gson();
		return objGson.toJson(cliente);
	}
	
	
	@RequestMapping(value="/saveCliente", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public @ResponseBody String saveSystemParameters(@RequestParam String sexo,@RequestParam Date fechaNacimiento,@RequestParam Integer dni,@RequestParam String  apellidoMaterno,@RequestParam String  apellidoPaterno,@RequestParam String  direccion,@RequestParam String  correo,@RequestParam String  nombres){
		
		String jsonResponse= null;
		
		Cliente objCliente=new Cliente();
		objCliente.setCChSexo(sexo);
		objCliente.setCDtFechaNacimiento(fechaNacimiento);;
		objCliente.setCInDni(dni);
		objCliente.setCInStatus(1);
		objCliente.setCStApellidoMaterno(apellidoMaterno);
		objCliente.setCStApellidoPaterno(apellidoPaterno);
		objCliente.setCStCorreo(correo);
		objCliente.setCStDireccion(direccion);
		objCliente.setCStNombres(nombres);
		
		try{
		clienteService.saveCliente(objCliente);
			jsonResponse="{respuesta:correcto}";
		}
		catch(Exception e){
			jsonResponse="{respuesta:incorrecto}";
		}
		return jsonResponse;
	}

}
