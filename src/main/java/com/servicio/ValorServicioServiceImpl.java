package com.servicio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ICrudDAO;
import com.modelo.Cliente;
import com.modelo.Especie;
import com.modelo.Historial;
import com.modelo.Mascota;
import com.modelo.ServicioMascota;
import com.modelo.ValorServicio;
import com.recursos.SQLConstants.SQLCliente;
import com.recursos.SQLConstants.SQLMascota;

@Service(value="valorservicioService")
public class ValorServicioServiceImpl implements ValorServicioService {

	@Resource  
	private ICrudDAO<ValorServicio> valorServicioCrudDAO;
	

	@Override
	public List<ValorServicio> getValoresServicio() {
		List<ValorServicio> valorServicio=valorServicioCrudDAO.findAll(ValorServicio.class);
		return valorServicio;
	}

	@Override
	public ValorServicio getValorServicio(int vsInValorServicioPk) {
		return valorServicioCrudDAO.findById(ValorServicio.class,vsInValorServicioPk);

	}

	@Override
	public void saveValorServicio(ValorServicio objValorServicio) {
		valorServicioCrudDAO.persist(objValorServicio);
		
	}

	@Override
	public void updateValorServicio(ValorServicio objValorServicio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteValorServicio(int vsInValorServicioPk) {
		// TODO Auto-generated method stub
		
	}



}
