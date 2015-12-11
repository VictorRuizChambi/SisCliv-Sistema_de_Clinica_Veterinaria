package com.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.recursos.Exclude;
import com.recursos.SQLConstants.SQLUsuario;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name=SQLUsuario.QUERY_FIND_USER_BY_DNI, query="SELECT u FROM Usuario u Where u.uInDni=:uInDni"),
@NamedQuery(name=SQLUsuario.QUERY_VERIFICA_USUARIO, query="SELECT u FROM Usuario u Where u.uInDni =:uInDni and u.uStContrasena =:uStContrasena")
})
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="u_in_usuario_pk")
	private int uInUsuarioPk;

	@Temporal(TemporalType.DATE)
	private Date u_dt_fechaRegistro;

	@Column(name="u_in_dni")
	private int uInDni;

	@Column(name="u_in_status")
	private int uInStatus;

	@Column(name="u_st_contrasena")
	private String uStContrasena;

	//bi-directional many-to-one association to Cita
	@Exclude
	@OneToMany(mappedBy="usuario")
	private List<Cita> citas;
	
	//bi-directional many-to-one association to Cliente
	@Exclude
	@OneToMany(mappedBy="usuario")
	private List<Cliente> clientes;

	//bi-directional many-to-one association to Trabajador
	@Exclude
	@OneToMany(mappedBy="usuario")
	private List<Trabajador> trabajadors;

	//bi-directional many-to-one association to Perfil
	@ManyToOne
	@JoinColumn(name="p_in_perfil_fk")
	private Perfil perfil;

	public Usuario() {
	}

	public int getUInUsuarioPk() {
		return this.uInUsuarioPk;
	}

	public void setUInUsuarioPk(int uInUsuarioPk) {
		this.uInUsuarioPk = uInUsuarioPk;
	}

	public Date getU_dt_fechaRegistro() {
		return this.u_dt_fechaRegistro;
	}

	public void setU_dt_fechaRegistro(Date u_dt_fechaRegistro) {
		this.u_dt_fechaRegistro = u_dt_fechaRegistro;
	}

	public int getUInDni() {
		return this.uInDni;
	}

	public void setUInDni(int uInDni) {
		this.uInDni = uInDni;
	}

	public int getUInStatus() {
		return this.uInStatus;
	}

	public void setUInStatus(int uInStatus) {
		this.uInStatus = uInStatus;
	}

	public String getUStContrasena() {
		return this.uStContrasena;
	}

	public void setUStContrasena(String uStContrasena) {
		this.uStContrasena = uStContrasena;
	}

	public List<Cita> getCitas() {
		return this.citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public Cita addCita(Cita cita) {
		getCitas().add(cita);
		cita.setUsuario(this);

		return cita;
	}

	public Cita removeCita(Cita cita) {
		getCitas().remove(cita);
		cita.setUsuario(null);

		return cita;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente addCliente(Cliente cliente) {
		getClientes().add(cliente);
		cliente.setUsuario(this);

		return cliente;
	}

	public Cliente removeCliente(Cliente cliente) {
		getClientes().remove(cliente);
		cliente.setUsuario(null);

		return cliente;
	}

	public List<Trabajador> getTrabajadors() {
		return this.trabajadors;
	}

	public void setTrabajadors(List<Trabajador> trabajadors) {
		this.trabajadors = trabajadors;
	}

	public Trabajador addTrabajador(Trabajador trabajador) {
		getTrabajadors().add(trabajador);
		trabajador.setUsuario(this);

		return trabajador;
	}

	public Trabajador removeTrabajador(Trabajador trabajador) {
		getTrabajadors().remove(trabajador);
		trabajador.setUsuario(null);

		return trabajador;
	}

	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

}