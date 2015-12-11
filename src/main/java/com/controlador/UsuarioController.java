package com.controlador;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.modelo.Cita;
import com.modelo.Usuario;
import com.servicio.CitaService;

@Controller
public class UsuarioController {

	@Autowired
	CitaService citaService;
	
	@RequestMapping(value = "/MenuUsuario")
	public String getReservarCita(){
		return "ReservarCita";
	}	
	
	@RequestMapping(value = "/ReservarCita", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public @ResponseBody String ReservarCita(Model modelo,HttpServletRequest req,@RequestParam String dni,@RequestParam String fecha) throws Exception {		
		System.out.println(dni+" "+fecha);
		Date date=this.transform(fecha);		
		System.out.println(date.toLocaleString());
		Cita c= new Cita();
		c.setCiDtFecha(date);
		c.setCiIntEstado(1);
		Usuario u = (Usuario) req.getSession().getAttribute("usuario");
		c.setUsuario(u);	
		citaService.saveCita(c);		
		Gson objGson = new Gson();		
		return objGson.toJson("error");		
	}
	
	@RequestMapping(value = "/getUsuario", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public @ResponseBody String GetUsuario(Model modelo,HttpServletRequest req) throws Exception {				
		Usuario c = (Usuario) req.getSession().getAttribute("usuario");
		System.out.println("dni de usuario logueado"+c.getUInDni());		
		Gson objGson = new Gson();		
		return objGson.toJson(c.getUInDni());			
	}
	
	@RequestMapping(value = "/CerrarSesion", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public @ResponseBody String CerrarSesion(Model modelo,HttpServletRequest req) throws Exception {
		req.getSession().setAttribute("usuario", null);
		System.out.println("llamaron a cerrar sesion");
		Gson objGson = new Gson();		
		return objGson.toJson("error");		
	}
	public Date transform(String fecha)
	{
		int dia=Integer.parseInt(fecha.substring(0, 2));
		int mes=Integer.parseInt(fecha.substring(3, 5));	
		int año=Integer.parseInt(fecha.substring(6, 8));				
		Date fechaDate=new Date(año+100,mes-1,dia,0,0,0);
		return fechaDate;
	}
}
