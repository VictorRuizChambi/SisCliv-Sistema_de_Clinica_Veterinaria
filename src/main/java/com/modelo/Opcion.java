package com.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the opcion database table.
 * 
 */
@Entity
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

	public Servicio addServicio(Servicio servicio) {
		getServicios().add(servicio);
		servicio.setOpcion(this);

		return servicio;
	}

	public Servicio removeServicio(Servicio servicio) {
		getServicios().remove(servicio);
		servicio.setOpcion(null);

		return servicio;
	}

}