package com.controlador;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.modelo.ServicioMascota;
import com.modelo.Usuario;
import com.modelo.ValorServicio;
import com.recursos.AnnotationExclusionStrategy;
import com.servicio.ServicioMascotaService;

@Controller
public class MedicoController {
	@Autowired
	ServicioMascotaService servicioMascotaService;
	
	  
	  @RequestMapping(value="/getConsultas", method = RequestMethod.GET , produces = "application/json;charset=UTF-8")
		public @ResponseBody String getMascotas(HttpServletRequest req) throws Exception{
		  Usuario u=(Usuario) req.getSession().getAttribute("usuario");
		  List<ServicioMascota> objServicioMascota=null; 
		  try{
			  objServicioMascota= servicioMascotaService.getServiciosPendientes(0,u.getUInDni());
//			  System.out.println(new Date());
//			  System.out.println();
			  
			  
		  }catch(Exception e){}
		  String jsonResponse= null;
		  final Gson gson = new GsonBuilder().setExclusionStrategies(new AnnotationExclusionStrategy()).create();
		  jsonResponse = gson.toJson(objServicioMascota);
		  System.out.println(jsonResponse);
		  return jsonResponse;		
	  }
	  @RequestMapping(value="/saveServicio", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
		public @ResponseBody String saveServicio(@RequestParam int sInServicioPk,@RequestParam int smInServicioMascotaPk,@RequestParam int temperatura,
				@RequestParam int peso,
				@RequestParam String ObservacionesConsulta,
				@RequestParam String ObservacionesTratamiento,
				@RequestParam int leucositos,
				@RequestParam int hematies,
				@RequestParam int hematocrito,
				@RequestParam int hemoglobina,
				@RequestParam int vmc,
				@RequestParam int chm,
				@RequestParam String ObservacionesSangre,
				@RequestParam int color,
				@RequestParam int aspecto,
				@RequestParam int densidad,
				@RequestParam int ph,
				@RequestParam int billiabuinos,
				@RequestParam String ObservacionesUrologia,
				@RequestParam int proteinas) throws Exception{
		  ServicioMascota serviciomascota=servicioMascotaService.getServicioMascota(smInServicioMascotaPk);
		  switch (sInServicioPk) {
		case 1:
			
			
			ValorServicio valorServicio1=new ValorServicio();
			ValorServicio valorServicio2=new ValorServicio();
			ValorServicio valorServicio3=new ValorServicio();
			
			valorServicio1.setServicioMascota(serviciomascota);
			valorServicio2.setServicioMascota(serviciomascota);
			valorServicio3.setServicioMascota(serviciomascota);
			
			valorServicio1.setNombreCampo(servicioMascotaService.getNombrCampo(2));
			valorServicio2.setNombreCampo(servicioMascotaService.getNombrCampo(3));
			valorServicio3.setNombreCampo(servicioMascotaService.getNombrCampo(12));
			
			valorServicio1.setVsStValor(peso+"");
			valorServicio2.setVsStValor(temperatura+"");
			valorServicio3.setVsStValor(ObservacionesConsulta);
			
			servicioMascotaService.saveValorServicio(valorServicio1);
			servicioMascotaService.saveValorServicio(valorServicio2);
			servicioMascotaService.saveValorServicio(valorServicio3);
			
			break;

		case 3:
			ValorServicio valorServicio22=new ValorServicio();
			valorServicio22.setServicioMascota(serviciomascota);
			valorServicio22.setNombreCampo(servicioMascotaService.getNombrCampo(22));
			valorServicio22.setVsStValor(ObservacionesTratamiento);
			servicioMascotaService.saveValorServicio(valorServicio22);
			break;
		case 6:

			ValorServicio valorServicio4=new ValorServicio();
			ValorServicio valorServicio5=new ValorServicio();
			ValorServicio valorServicio6=new ValorServicio();
			ValorServicio valorServicio7=new ValorServicio();
			ValorServicio valorServicio8=new ValorServicio();
			ValorServicio valorServicio9=new ValorServicio();
			ValorServicio valorServicio10=new ValorServicio();
			
			valorServicio4.setServicioMascota(serviciomascota);
			valorServicio5.setServicioMascota(serviciomascota);
			valorServicio6.setServicioMascota(serviciomascota);
			valorServicio7.setServicioMascota(serviciomascota);
			valorServicio8.setServicioMascota(serviciomascota);
			valorServicio9.setServicioMascota(serviciomascota);
			valorServicio10.setServicioMascota(serviciomascota);
			
			valorServicio4.setNombreCampo(servicioMascotaService.getNombrCampo(8));
			valorServicio5.setNombreCampo(servicioMascotaService.getNombrCampo(9));
			valorServicio6.setNombreCampo(servicioMascotaService.getNombrCampo(10));
			valorServicio7.setNombreCampo(servicioMascotaService.getNombrCampo(11));
			valorServicio8.setNombreCampo(servicioMascotaService.getNombrCampo(12));
			valorServicio9.setNombreCampo(servicioMascotaService.getNombrCampo(13));
			valorServicio10.setNombreCampo(servicioMascotaService.getNombrCampo(14));
			
			valorServicio4.setVsStValor(leucositos+"");
			valorServicio5.setVsStValor(hematies+"");
			valorServicio6.setVsStValor(hematocrito+"");
			valorServicio7.setVsStValor(hemoglobina+"");
			valorServicio8.setVsStValor(vmc+"");
			valorServicio9.setVsStValor(chm+"");
			valorServicio10.setVsStValor(ObservacionesSangre);
			
			servicioMascotaService.saveValorServicio(valorServicio4);
			servicioMascotaService.saveValorServicio(valorServicio5);
			servicioMascotaService.saveValorServicio(valorServicio6);
			servicioMascotaService.saveValorServicio(valorServicio7);
			servicioMascotaService.saveValorServicio(valorServicio8);
			servicioMascotaService.saveValorServicio(valorServicio9);
			servicioMascotaService.saveValorServicio(valorServicio10);
			
			
			break;
		case 7:
			ValorServicio valorServicio11=new ValorServicio();
			ValorServicio valorServicio12=new ValorServicio();
			ValorServicio valorServicio13=new ValorServicio();
			ValorServicio valorServicio14=new ValorServicio();
			ValorServicio valorServicio15=new ValorServicio();
			ValorServicio valorServicio16=new ValorServicio();
			ValorServicio valorServicio17=new ValorServicio();
			
			valorServicio11.setServicioMascota(serviciomascota);
			valorServicio12.setServicioMascota(serviciomascota);
			valorServicio13.setServicioMascota(serviciomascota);
			valorServicio14.setServicioMascota(serviciomascota);
			valorServicio15.setServicioMascota(serviciomascota);
			valorServicio16.setServicioMascota(serviciomascota);
			valorServicio17.setServicioMascota(serviciomascota);
			
			valorServicio11.setNombreCampo(servicioMascotaService.getNombrCampo(15));
			valorServicio12.setNombreCampo(servicioMascotaService.getNombrCampo(16));
			valorServicio13.setNombreCampo(servicioMascotaService.getNombrCampo(17));
			valorServicio14.setNombreCampo(servicioMascotaService.getNombrCampo(18));
			valorServicio15.setNombreCampo(servicioMascotaService.getNombrCampo(19));
			valorServicio16.setNombreCampo(servicioMascotaService.getNombrCampo(20));
			valorServicio17.setNombreCampo(servicioMascotaService.getNombrCampo(21));
			
			valorServicio11.setVsStValor(color+"");
			valorServicio12.setVsStValor(aspecto+"");
			valorServicio13.setVsStValor(densidad+"");
			valorServicio14.setVsStValor(ph+"");
			valorServicio15.setVsStValor(proteinas+"");
			valorServicio16.setVsStValor(billiabuinos+"");
			valorServicio17.setVsStValor(ObservacionesUrologia);
			
			servicioMascotaService.saveValorServicio(valorServicio11);
			servicioMascotaService.saveValorServicio(valorServicio12);
			servicioMascotaService.saveValorServicio(valorServicio13);
			servicioMascotaService.saveValorServicio(valorServicio14);
			servicioMascotaService.saveValorServicio(valorServicio15);
			servicioMascotaService.saveValorServicio(valorServicio16);
			servicioMascotaService.saveValorServicio(valorServicio17);
			
			break;
		}
		  
		  
		  
		  
			Gson objGson = new Gson();
			
			return objGson.toJson("ERROR");
		}
	  
	  
		

}
