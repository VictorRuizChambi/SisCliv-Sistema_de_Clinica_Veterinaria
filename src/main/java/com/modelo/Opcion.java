package com.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.recursos.Exclude;


/**
 * The persistent class for the opcion database table.
 * 
 */
@Entity
@Table(name="OPCION")
@NamedQuery(name="Opcion.findAll", query="SELECT o FROM Opcion o")
public class Opcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="o_in_opcion_pk")
	private int oInOpcionPk;

	@Column(name="o_in_status")
	private int oInStatus;

	@Column(name="o_st_descripcion")
	private String oStDescripcion;

	@Column(name="o_st_nombre")
	private String oStNombre;

	//bi-directional many-to-one association to Perfil
	@ManyToOne
	@JoinColumn(name="p_in_perfil_fk")
	private Perfil perfil;

	//bi-directional many-to-one association to Servicio
	@Exclude
	@OneToMany(mappedBy="opcion")
	private List<Servicio> servicios;

	public Opcion() {
	}

	public int getOInOpcionPk() {
		return this.oInOpcionPk;
	}

	public void setOInOpcionPk(int oInOpcionPk) {
		this.oInOpcionPk = oInOpcionPk;
	}

	public int getOInStatus() {
		return this.oInStatus;
	}

	public void setOInStatus(int oInStatus) {
		this.oInStatus = oInStatus;
	}

	public String getOStDescripcion() {
		return this.oStDescripcion;
	}

	public void setOStDescripcion(String oStDescripcion) {
		this.oStDescripcion = oStDescripcion;
	}

	public String getOStNombre() {
		return this.oStNombre;
	}

	public void setOStNombre(String oStNombre) {
		this.oStNombre = oStNombre;
	}

	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public List<Servicio> getServicios() {
		return this.servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}


}