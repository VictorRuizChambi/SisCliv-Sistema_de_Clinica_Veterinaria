package com.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the historial database table.
 * 
 */
@Entity
@NamedQuery(name="Historial.findAll", query="SELECT h FROM Historial h")
public class Historial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="h_in_historial_pk")
	private int hInHistorialPk;

	//bi-directional many-to-one association to Mascota
	@ManyToOne
	@JoinColumn(name="m_in_mascota_fk")
	private Mascota mascota;

	//bi-directional many-to-one association to ServicioMascota
	@OneToMany(mappedBy="historial")
	private List<ServicioMascota> servicioMascotas;

	public Historial() {
	}

	public int getHInHistorialPk() {
		return this.hInHistorialPk;
	}

	public void setHInHistorialPk(int hInHistorialPk) {
		this.hInHistorialPk = hInHistorialPk;
	}

	public Mascota getMascota() {
		return this.mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public List<ServicioMascota> getServicioMascotas() {
		return this.servicioMascotas;
	}

	public void setServicioMascotas(List<ServicioMascota> servicioMascotas) {
		this.servicioMascotas = servicioMascotas;
	}

	public ServicioMascota addServicioMascota(ServicioMascota servicioMascota) {
		getServicioMascotas().add(servicioMascota);
		servicioMascota.setHistorial(this);

		return servicioMascota;
	}

	public ServicioMascota removeServicioMascota(ServicioMascota servicioMascota) {
		getServicioMascotas().remove(servicioMascota);
		servicioMascota.setHistorial(null);

		return servicioMascota;
	}

}