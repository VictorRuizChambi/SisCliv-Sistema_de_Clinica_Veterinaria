package com.servicio;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.modelo.Cliente;

@Transactional(propagation = Propagation.REQUIRED)
public interface ComercioService {
	
//	public List<Comercio> getComercios();
//	public Comercio getComercio(int codigo);
	
}
