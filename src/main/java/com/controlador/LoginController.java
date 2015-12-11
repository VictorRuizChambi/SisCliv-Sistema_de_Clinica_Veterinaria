package com.controlador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.modelo.Usuario;
import com.servicio.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService usuarioService;
	
	
	
	@RequestMapping(value = "/ProcesaLogin", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public @ResponseBody String ProcesaLogin(Model modelo,HttpServletRequest req,@RequestParam int dni,@RequestParam String contrasena) throws Exception {
		
		String salida;
		Usuario usuario =new Usuario();
		usuario.setUInDni(dni);
		//usuario.setUInDni(45321245);
		usuario.setUStContrasena(contrasena);
		System.out.println(usuario.getUInDni()+""+usuario.getUStContrasena());
		System.out.println();
		Usuario u=usuarioService.verificaUsuario(dni,contrasena);
		if(u!=null)
		{
			System.out.println("usuario correcto");	
			HttpSession misession = req.getSession(true);                        
			misession.setAttribute("usuario",u);			
			salida=u.getPerfil().getPInPerfilPk()+"";
		}
		else
		{			
			System.out.println("usuario incorrecto");
			salida="-1";
		}
		
		System.out.println("Perfil id : "+salida);
		Gson objGson = new Gson();
		
		return objGson.toJson(salida);		
	}
	
}
