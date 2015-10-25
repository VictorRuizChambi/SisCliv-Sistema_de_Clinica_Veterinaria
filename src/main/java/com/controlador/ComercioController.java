package com.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;
import com.modelo.Cliente;

@Controller
public class ComercioController {
//	@Autowired
//	ComercioService comercioService;
//	
//
//	@RequestMapping(value="/getComercios", method = RequestMethod.GET , produces = "application/json;charset=UTF-8")
//	public @ResponseBody String getComercios() throws Exception{
//		List<Cliente> comercios = comercioService.getClientes(); 
//		Gson objGson = new Gson();
//		System.out.println(objGson.toJson(comercios));
//		return objGson.toJson(comercios);
//	}	
//	
//	@RequestMapping(value="/getComercio", method = RequestMethod.GET , produces = "application/json;charset=UTF-8")
//	public @ResponseBody String getComercio(@RequestParam int codigo) throws Exception{
//		Cliente comercio = comercioService.getCliente(codigo); 
//		Gson objGson = new Gson();
//		return objGson.toJson(comercio);
//	}

}
