package com.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.recursos.SQLConstants.SQLSHistorial;
import com.recursos.SQLConstants.SQLServicioMascota;


/**
 * The persistent class for the servicio_mascota database table.
 * 
 */
@Entity
@Table(name="SERVICIO_MASCOTA")
@NamedQueries({
@NamedQuery(name=SQLServicioMascota.QUERY_FIND_CONSULTA_ATENDIDO_DAY, query="SELECT s FROM ServicioMascota s WHERE s.smInAtendido=:smInAtendido and s.trabajador.tInDni=:tInDni"),
@NamedQuery(name=SQLSHistorial.QUERY_FIND_SERVICIOMASCOTA_BY_USUARIOPK,query="SELECT s FROM ServicioMascota s Where s.historial.mascota.cliente.usuario.uInUsuarioPk=:uInUsuarioPk")
})
public class ServicioMascota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sm_in_servicio_mascota_pk")
	private int smInServicioMascotaPk;

	@ManyToOne
	@JoinColumn(name="h_in_historial_fk")
	private Historial historial;
	
	public Historial getHistorial() {
		return historial;
	}

	public void setHistorial(Historial historial) {
		this.historial = historial;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="sm_dt_fecha_servicio")
	private Date smDtFechaServicio;

	@Column(name="sm_in_atendido")
	private int smInAtendido;


	@ManyToOne
	@JoinColumn(name="t_in_trabajador_fk")
	private Trabajador trabajador;

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	//bi-directional many-to-one association to Servicio
	@ManyToOne
	@JoinColumn(name="s_in_servicio_fk")
	private Servicio servicio;

	public ServicioMascota() {
	}

	public int getSmInServicioMascotaPk() {
		return this.smInServicioMascotaPk;
	}

	public void setSmInServicioMascotaPk(int smInServicioMascotaPk) {
		this.smInServicioMascotaPk = smInServicioMascotaPk;
	}

	public Date getSmDtFechaServicio() {
		return this.smDtFechaServicio;
	}

	public void setSmDtFechaServicio(Date smDtFechaServicio) {
		this.smDtFechaServicio = smDtFechaServicio;
	}

	public int getSmInAtendido() {
		return this.smInAtendido;
	}

	public void setSmInAtendido(int smInAtendido) {
		this.smInAtendido = smInAtendido;
	}

	public Servicio getServicio() {
		return this.servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

}