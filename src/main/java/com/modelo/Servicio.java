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
 * The persistent class for the servicio database table.
 * 
 */
@Entity
@Table(name="SERVICIO")
@NamedQuery(name="Servicio.findAll", query="SELECT s FROM Servicio s")
public class Servicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="s_in_servicio_pk")
	private int sInServicioPk;

	@ManyToOne
	@JoinColumn(name="o_in_opcion_fk")
	private Opcion opcion;
	
	public Opcion getOpcion() {
		return opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}

	@Column(name="s_db_precio")
	private double sDbPrecio;

	@Column(name="s_st_descripcion")
	private String sStDescripcion;

	@Column(name="s_st_nombre")
	private String sStNombre;

	//bi-directional many-to-one association to ServicioMascota
	@Exclude
	@OneToMany(mappedBy="servicio")
	private List<ServicioMascota> servicioMascotas;

	public Servicio() {
	}

	public int getSInServicioPk() {
		return this.sInServicioPk;
	}

	public void setSInServicioPk(int sInServicioPk) {
		this.sInServicioPk = sInServicioPk;
	}

	public double getSDbPrecio() {
		return this.sDbPrecio;
	}

	public void setSDbPrecio(double sDbPrecio) {
		this.sDbPrecio = sDbPrecio;
	}

	public String getSStDescripcion() {
		return this.sStDescripcion;
	}

	public void setSStDescripcion(String sStDescripcion) {
		this.sStDescripcion = sStDescripcion;
	}

	public String getSStNombre() {
		return this.sStNombre;
	}

	public void setSStNombre(String sStNombre) {
		this.sStNombre = sStNombre;
	}

	public List<ServicioMascota> getServicioMascotas() {
		return this.servicioMascotas;
	}

	public void setServicioMascotas(List<ServicioMascota> servicioMascotas) {
		this.servicioMascotas = servicioMascotas;
	}

	public ServicioMascota addServicioMascota(ServicioMascota servicioMascota) {
		getServicioMascotas().add(servicioMascota);
		servicioMascota.setServicio(this);

		return servicioMascota;
	}

	public ServicioMascota removeServicioMascota(ServicioMascota servicioMascota) {
		getServicioMascotas().remove(servicioMascota);
		servicioMascota.setServicio(null);

		return servicioMascota;
	}

}