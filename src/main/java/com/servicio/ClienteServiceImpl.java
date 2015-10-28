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
		System.out.println("Esta intentando traer clientes");
		List<Cliente> clientes=clienteCrudDAO.findAll(Cliente.class);
		System.out.println(clientes.get(0).getCStNombres());;
		return clientes;
	}

	@Override
	public Cliente getCliente(int cInClientePk) {
		System.out.println("Esta intentando traer un cliente");
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
