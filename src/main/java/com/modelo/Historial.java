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
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.recursos.Exclude;


/**
 * The persistent class for the historial database table.
 * 
 */
@Entity
@Table(name="HISTORIAL")
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

	@ManyToOne
	@JoinColumn(name="m_in_mascota_fk")
	private Mascota mascota;


	//bi-directional many-to-one association to ServicioMascota
	@Exclude
	@OneToMany(mappedBy="historial")
	private List<ServicioMascota> servicioMascota;

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

	public Mascota getMascota() {
		return this.mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public List<ServicioMascota> getServicioMascota() {
		return this.servicioMascota;
	}

	public void setServicioMascota(List<ServicioMascota> servicioMascota) {
		this.servicioMascota = servicioMascota;
	}


}