package com.servicio;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.modelo.ServicioMascota;
import com.modelo.ValorServicio;

@Transactional(propagation = Propagation.REQUIRED)
public interface ValorServicioService {

	
	
	public List<ValorServicio> getValoresServicio();
	public ValorServicio getValorServicio(int vsInValorServicioPk);
	public void saveValorServicio(ValorServicio objValorServicio);
	public void updateValorServicio(ValorServicio objValorServicio);
	public void deleteValorServicio(int vsInValorServicioPk);

}
