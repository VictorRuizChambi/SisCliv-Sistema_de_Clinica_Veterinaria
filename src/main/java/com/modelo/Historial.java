package com.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
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

	@Temporal(TemporalType.DATE)
	@Column(name="h_dt_fecha_de_creacion")
	private Date hDtFechaDeCreacion;

	@Column(name="h_in_status")
	private int hInStatus;

	//bi-directional many-to-one association to Mascota
	@OneToMany(mappedBy="historial")
	private List<Mascota> mascotas;

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

	public Date getHDtFechaDeCreacion() {
		return this.hDtFechaDeCreacion;
	}

	public void setHDtFechaDeCreacion(Date hDtFechaDeCreacion) {
		this.hDtFechaDeCreacion = hDtFechaDeCreacion;
	}

	public int getHInStatus() {
		return this.hInStatus;
	}

	public void setHInStatus(int hInStatus) {
		this.hInStatus = hInStatus;
	}

	public List<Mascota> getMascotas() {
		return this.mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public Mascota addMascota(Mascota mascota) {
		getMascotas().add(mascota);
		mascota.setHistorial(this);

		return mascota;
	}

	public Mascota removeMascota(Mascota mascota) {
		getMascotas().remove(mascota);
		mascota.setHistorial(null);

		return mascota;
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