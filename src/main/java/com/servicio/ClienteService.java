package com.servicio;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.modelo.Cliente;

@Transactional(propagation = Propagation.REQUIRED)
public interface ClienteService {

	public List<Cliente> getClientes();
	public Cliente getCliente(int cInClientePk);
	public void saveCliente(Cliente objCliente);
	public void updatetCliente(Cliente objCliente);
	public void deleteCliente(int cInClientePk);
}
