package com.controlador;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
//import com.modelo.Paciente;
import com.modelo.ServicioMascota;
import com.modelo.ValorServicio;
import com.recursos.AnnotationExclusionStrategy;
import com.servicio.ClienteService;
import com.servicio.HistorialService;
import com.servicio.MascotaService;
import com.servicio.PerfilService;
import com.servicio.ServicioMascotaService;
import com.servicio.TrabajadorService;
import com.servicio.UserService;
import com.servicio.ValorServicioService;

@Controller
public class RecepcionistaController {
	@Autowired
	UserService userService;
	@Autowired
	ClienteService clienteService;
	@Autowired
	MascotaService mascotaService;
	@Autowired
	PerfilService perfilService;
	@Autowired
	HistorialService historialService;
	@Autowired
	ServicioMascotaService serviciomascotaService;
	@Autowired
	TrabajadorService trabajadorService;
	@Autowired
	ValorServicioService valorServicioService;
	
	
//	@RequestMapping(value="/getPacientes", method = RequestMethod.GET , produces = "application/json;charset=UTF-8")
//	public @ResponseBody String getPacientes() throws Exception{
//		List<Mascota> mascotas = mascotaService.getMascotas();
////		List<Paciente> pacientes = new ArrayList();
//		
//		for(Mascota mas : mascotas){
////			Paciente mipaciente = new Paciente();
////			mipaciente.setNomC(mas.getCliente().getCStNombres());
////			mipaciente.setNomM(mas.getMStNombre());
////			mipaciente.setNumH(mas.getHistorial().getHInHistorialPk());
////			pacientes.add(mipaciente);
//		}
//		
//		String jsonResponse= null;
//		final Gson gson = new GsonBuilder().setExclusionStrategies(new AnnotationExclusionStrategy()).create();
//		jsonResponse = gson.toJson(pacientes);
//
//
//		return jsonResponse;		
//	}	
//
	
//		@RequestMapping(value="/registrarServicio", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
//		public @ResponseBody String registrarServicio(@RequestParam int pnumH,@RequestParam String pnomC,
//				@RequestParam String pnomM, @RequestParam String fecha) throws Exception{
//			
//			ServicioMascota objSerMascota = new ServicioMascota();
//			int idmascota = Integer.parseInt(String.valueOf(mascotaService.getMascotaporHistorial(pnumH).get(0)[0]));
//			objSerMascota.setHistorial(mascotaService.getMascota(idmascota).getHistorial());
//			objSerMascota.setTrabajador(trabajadorService.getTrabajador(1));//el trabajador con id 1 tiene perfil recepcionista 
//			
//			serviciomascotaService.saveServicioMascota(objSerMascota);
//			
//			ValorServicio objValorServicio = new ValorServicio();
//			
//			
//			
////			objValorServicio.setServicioMascota(serviciomascotaService.getServicioMascota(smInServicioMascotaPk));
//			
//			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//			String dateInString = fecha.replace('/', '-');
//			objValorServicio.setVsStValor(dateInString);
//		
//		
//			
//	 
//			System.out.println("Cliente guardado");
//			Gson objGson = new Gson();
//			
//			return objGson.toJson("ERROR");
//		}
	


}
