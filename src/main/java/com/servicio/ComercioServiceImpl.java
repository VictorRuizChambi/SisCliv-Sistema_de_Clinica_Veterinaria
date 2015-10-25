package com.servicio;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ICrudDAO;
import com.modelo.Cliente;
@Service(value="comercioService")
public class ComercioServiceImpl implements ComercioService {

//	@Resource  
//	private ICrudDAO<Comercio> comercioDAO;
//		
//	@Override
//	public List<Comercio> getComercios() {
//		return comercioDAO.findAll(Comercio.class);
//		
//	}
//
//	@Override
//	public Comercio getComercio(int codigo) {
//		return comercioDAO.findById(Comercio.class, codigo);
//	}

}
