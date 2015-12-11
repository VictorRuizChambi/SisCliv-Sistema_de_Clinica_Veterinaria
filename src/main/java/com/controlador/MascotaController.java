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
import com.modelo.Mascota;
import com.recursos.AnnotationExclusionStrategy;
import com.servicio.ClienteService;
import com.servicio.MascotaService;

@Controller
public class MascotaController {
	@Autowired
	ClienteService clienteService;
	@Autowired
	MascotaService mascotaService;
	  
	  @RequestMapping(value="/getMascotas", method = RequestMethod.GET , produces = "application/json;charset=UTF-8")
		public @ResponseBody String getMascotas() throws Exception{
		  List<Mascota> lMascotas = mascotaService.getMascotas();
		  String jsonResponse= null;
		  final Gson gson = new GsonBuilder().setExclusionStrategies(new AnnotationExclusionStrategy()).create();
		  jsonResponse = gson.toJson(lMascotas);
		  System.out.println(jsonResponse);
		  return jsonResponse;		
	  }
	  
		@RequestMapping(value="/actualizarMascota", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
		public @ResponseBody String actualizarMascota(@RequestParam int mInMascotaPk,@RequestParam String mStNombre,@RequestParam int mInEsterilizado,@RequestParam String mChSexo,@RequestParam String mDtFechaNacimiento,@RequestParam int cInClientePk,@RequestParam int eInEspeciePk) throws Exception{
		
			Mascota objMascota= new Mascota();
			objMascota.setMInMascotaPk(mInMascotaPk);
			objMascota.setMChSexo(mChSexo);
//			mDtFechaNacimiento
			objMascota.setMDtFechaNacimiento(new Date());
			objMascota.setMInEsterilizado(mInEsterilizado);
			objMascota.setMStNombre(mStNombre);
			objMascota.setMInStatus(1);
			mascotaService.saveMascota(objMascota,cInClientePk,eInEspeciePk);
			System.out.println("DATOS A GUARDAR");
			System.out.println("mChSexo->"+mChSexo);
			System.out.println("mInEsterilizado->"+mInEsterilizado);
			System.out.println("mStNombre->"+mStNombre);
			System.out.println("cInClientePk->"+cInClientePk);
			System.out.println("eInEspeciePk->"+eInEspeciePk);
			System.out.println("Mascota guardado");
			Gson objGson = new Gson();
			
			return objGson.toJson("ERROR");
		}
		
		@RequestMapping(value="/guardarMascota", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
		public @ResponseBody String guardarMascota(@RequestParam String mStNombre,@RequestParam int mInEsterilizado,@RequestParam String mChSexo,@RequestParam String mDtFechaNacimiento,@RequestParam int cInClientePk,@RequestParam int eInEspeciePk) throws Exception{
		
			Mascota objMascota= new Mascota();
			objMascota.setMChSexo(mChSexo);
//			mDtFechaNacimiento
			objMascota.setMDtFechaNacimiento(new Date());
			objMascota.setMInStatus(1);
			objMascota.setMInEsterilizado(mInEsterilizado);
			objMascota.setMStNombre(mStNombre);
			mascotaService.saveMascota(objMascota,cInClientePk,eInEspeciePk);
			System.out.println("DATOS A GUARDAR");
			System.out.println("mChSexo->"+mChSexo);
			System.out.println("mInEsterilizado->"+mInEsterilizado);
			System.out.println("mStNombre->"+mStNombre);
			System.out.println("cInClientePk->"+cInClientePk);
			System.out.println("eInEspeciePk->"+eInEspeciePk);
			System.out.println("Mascota guardado");
			Gson objGson = new Gson();
			
			return objGson.toJson("ERROR");
		}
		@RequestMapping(value="/eliminarMascota", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
		public @ResponseBody String eliminarMascota(@RequestParam int mInMascotaPk) throws Exception{

			mascotaService.deleteMascota(mInMascotaPk);

			System.out.println("Mascota guardado");
			Gson objGson = new Gson();
			
			return objGson.toJson("ERROR");
		}

		
}
