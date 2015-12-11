package com.modelo;

import java.io.Serializable;

import javax.persistence.*;

import com.recursos.Exclude;

import java.util.List;


/**
 * The persistent class for the perfil database table.
 * 
 */
@Entity
@NamedQuery(name="Perfil.findAll", query="SELECT p FROM Perfil p")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="p_in_perfil_pk")
	private int pInPerfilPk;

	@Column(name="p_in_status")
	private int pInStatus;

	@Column(name="p_st_descripcion")
	private String pStDescripcion;

	@Column(name="p_st_nombre")
	private String pStNombre;

	//bi-directional many-to-one association to Opcion
	@Exclude
	@OneToMany(mappedBy="perfil")
	private List<Opcion> opcions;

	//bi-directional many-to-one association to Usuario
	@Exclude
	@OneToMany(mappedBy="perfil")
	private List<Usuario> usuarios;

	public Perfil() {
	}

	public int getPInPerfilPk() {
		return this.pInPerfilPk;
	}

	public void setPInPerfilPk(int pInPerfilPk) {
		this.pInPerfilPk = pInPerfilPk;
	}

	public int getPInStatus() {
		return this.pInStatus;
	}

	public void setPInStatus(int pInStatus) {
		this.pInStatus = pInStatus;
	}

	public String getPStDescripcion() {
		return this.pStDescripcion;
	}

	public void setPStDescripcion(String pStDescripcion) {
		this.pStDescripcion = pStDescripcion;
	}

	public String getPStNombre() {
		return this.pStNombre;
	}

	public void setPStNombre(String pStNombre) {
		this.pStNombre = pStNombre;
	}

	public List<Opcion> getOpcions() {
		return this.opcions;
	}

	public void setOpcions(List<Opcion> opcions) {
		this.opcions = opcions;
	}

	public Opcion addOpcion(Opcion opcion) {
		getOpcions().add(opcion);
		opcion.setPerfil(this);

		return opcion;
	}

	public Opcion removeOpcion(Opcion opcion) {
		getOpcions().remove(opcion);
		opcion.setPerfil(null);

		return opcion;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setPerfil(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setPerfil(null);

		return usuario;
	}

}