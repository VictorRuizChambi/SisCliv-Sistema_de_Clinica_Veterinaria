package com.servicio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ICrudDAO;
import com.modelo.Cliente;
import com.modelo.Mascota;
import com.recursos.SQLConstants.SQLCliente;
@Service(value="clienteService")
public class ClienteServiceImpl implements ClienteService {


	@Resource  
	private ICrudDAO<Cliente> clienteCrudDAO;
	@Resource  
	private ICrudDAO<Mascota> mascotaCrudDAO;
	
	@Override
	public List<Cliente> getClientes() {
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("cInStatus",1);
		List<Cliente> clientes=clienteCrudDAO.findByNamedQuery(SQLCliente.QUERY_FIND_BY_CLIENTE_BY_STATUS, objMap);//findAll(Cliente.class);
		return clientes;
	}

	@Override
	public Cliente getCliente(int cInClientePk) {
//		System.out.println("Esta intentando traer un cliente");
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
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("cInClientePk",cInClientePk);
		
		clienteCrudDAO.executeUpdateNamedQuery(SQLCliente.QUERY_DELETE_BY_CLIENTE_PK, parameters);

	}
	
	public Cliente getClienteByUsuarioPk(int uInUsuarioPk){
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("uInUsuarioPk",uInUsuarioPk);
		List<Cliente> clientes=clienteCrudDAO.findByNamedQuery(SQLCliente.QUERY_FIND_BY_USUARIO_PK, parameters);
		if(clientes.size()==1)
		return clientes.get(0);
		else
		return null;			
	}


}
