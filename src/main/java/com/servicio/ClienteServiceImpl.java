package com.servicio;

import java.util.List;

import javax.annotation.Resource;

import org.omg.CORBA.OBJECT_NOT_EXIST;
import org.springframework.stereotype.Service;

import com.dao.ICrudDAO;
import com.modelo.Cliente;
@Service(value="clienteService")
public class ClienteServiceImpl implements ClienteService {


	@Resource  
	private ICrudDAO<Cliente> clienteCrudDAO;
	
	@Override
	public List<Cliente> getClientes() {

		return clienteCrudDAO.findAll(Cliente.class);
	}

	@Override
	public Cliente getCliente(int cInClientePk) {

		return clienteCrudDAO.findById(Cliente.class,cInClientePk);
	}

	@Override
	public void saveCliente(Cliente objCliente) {
		clienteCrudDAO.persist(objCliente);
		
	}

	@Override
	public void updatetCliente(Cliente objCliente) {
		clienteCrudDAO.persist(objCliente);
			
		
	}
	
	@Override
	public void deleteCliente(int cInClientePk) {
		
	}

}
