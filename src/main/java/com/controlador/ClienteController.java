package com.controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import com.modelo.Mascota;
import com.modelo.Usuario;
import com.recursos.AnnotationExclusionStrategy;
import com.servicio.ClienteService;
import com.servicio.MascotaService;
import com.servicio.PerfilService;
import com.servicio.UserService;

@Controller
public class ClienteController {
	@Autowired
	UserService userService;
	@Autowired
	ClienteService clienteService;
	@Autowired
	MascotaService mascotaService;
	@Autowired
	PerfilService perfilService;
	
	
	@RequestMapping(value="/getClientes", method = RequestMethod.GET , produces = "application/json;charset=UTF-8")
	public @ResponseBody String getClientes() throws Exception{
		List<Cliente> clientes = clienteService.getClientes(); 		
		String jsonResponse= null;
		final Gson gson = new GsonBuilder().setExclusionStrategies(new AnnotationExclusionStrategy()).create();
		jsonResponse = gson.toJson(clientes);

		
		System.out.println("CLIENTE: \n"+jsonResponse);
		
		for(int i=0;i<clientes.size();i++){
			System.out.println("CLIENTE: "+ clientes.get(i).getCStNombres() + " identificador: " + clientes.get(i).getCInClientePk() +" \n");
		}
		return jsonResponse;		
	}	

	
		@RequestMapping(value="/guardarCliente", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
		public @ResponseBody String saveCliente(@RequestParam int cInDni,@RequestParam String cStNombres,@RequestParam 
				String cStApellidoPaterno,@RequestParam String cStApellidoMaterno,@RequestParam String cStCorreo,
				@RequestParam String cStDireccion,@RequestParam int cInTelefono,@RequestParam String cChSexo,
				@RequestParam String cDtFechaNacimiento) throws Exception{
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			String dateInString = cDtFechaNacimiento.replace('/', '-');
		
			
			Usuario objUsuario = new Usuario();
			Date curDate = new Date();
			String DateToStr = formatter.format(curDate);
			
			
			try {
				objUsuario.setU_dt_fechaRegistro(formatter.parse(DateToStr));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			objUsuario.setUStContrasena("1234");
			objUsuario.setUInStatus(1);
			
			objUsuario.setUInDni(cInDni);
			objUsuario.setPerfil(perfilService.getPerfil(5));	
			userService.saveUsuario(objUsuario);
			
			Cliente objCliente=new Cliente();
			objCliente.setCChSexo(cChSexo);
			objCliente.setCInDni(cInDni);
			objCliente.setCInStatus(1);
			objCliente.setCStApellidoMaterno(cStApellidoMaterno);
			objCliente.setCStApellidoPaterno(cStApellidoPaterno);
			objCliente.setCStCorreo(cStCorreo);
			objCliente.setCStDireccion(cStDireccion);
			objCliente.setCStNombres(cStNombres);
			objCliente.setCInTelefono(cInTelefono);
			
			
			try {
				objCliente.setCDtFechaNacimiento(formatter.parse(dateInString));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			objCliente.setUsuario(userService.getUsuarioporDni(cInDni));

			
			clienteService.saveCliente(objCliente); 
			System.out.println("Cliente guardado");
			Gson objGson = new Gson();
			
			return objGson.toJson("ERROR");
		}
	
		@RequestMapping(value="/deleteCliente", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
		public @ResponseBody String deleteCliente(@RequestParam int cInClientePk) throws Exception{

			clienteService.deleteCliente(cInClientePk);
			
			Gson objGson = new Gson();
			
			return objGson.toJson("ERROR");
		}
	

	  
	
		@RequestMapping(value="/actualizarCliente", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
		public @ResponseBody String actualizarCliente(@RequestParam int cInDni,@RequestParam String cStNombres,@RequestParam 
				String cStApellidoPaterno,@RequestParam String cStApellidoMaterno,@RequestParam String cStCorreo,
				@RequestParam String cStDireccion,@RequestParam int cInTelefono,@RequestParam String cChSexo,
				@RequestParam String cDtFechaNacimiento, @RequestParam int cInClientePk,@RequestParam int uInUsuarioPk) throws Exception{
	
			
			Cliente objCliente=new Cliente();
			objCliente.setCInClientePk(cInClientePk);
			objCliente.setCChSexo(cChSexo);
			objCliente.setCInDni(cInDni);
			objCliente.setCInStatus(1);
			objCliente.setCStApellidoMaterno(cStApellidoMaterno);
			objCliente.setCStApellidoPaterno(cStApellidoPaterno);
			objCliente.setCStCorreo(cStCorreo);
			objCliente.setCStDireccion(cStDireccion);
			objCliente.setCStNombres(cStNombres);
			objCliente.setCInTelefono(cInTelefono);
			
			objCliente.setUsuario(userService.getUsuario(uInUsuarioPk));
			
			objCliente.setCDtFechaNacimiento(new Date());

			clienteService.updatetCliente(objCliente);

			System.out.println("Cliente guardado");
			Gson objGson = new Gson();
			
			return objGson.toJson("ERROR");
		}
		
		
		
	
	
	
		@RequestMapping(value = "/")
		public String getInicio(){
			return "Inicio";
		}
		@RequestMapping(value = "/Inicio")
		public String getInici(){
			return "Inicio";
		}
		
		@RequestMapping(value = "/ConsultarConsultasAsignadas")
		public String getRecepcionista(){
			return "ConsultarConsultasAsignadas";
		}
		
		@RequestMapping(value = "/ReservarCita")
		public String getReceravarCita(){
			return "ReservarCita";
		}
		
		
		@RequestMapping(value = "/ConsultarCliente")
		public String getConsultarCliente(){
			return "ConsultarCliente";
		}
		@RequestMapping(value = "/ConsultarMascota")
		public String getConsultarMascota(){
			return "ConsultarMascota";
		}
		
}
