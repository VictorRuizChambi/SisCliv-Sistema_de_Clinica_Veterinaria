package com.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the servicio_mascota database table.
 * 
 */
@Entity
@Table(name="servicio_mascota")
@NamedQuery(name="ServicioMascota.findAll", query="SELECT s FROM ServicioMascota s")
public class ServicioMascota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sm_in_servicio_mascota_pk")
	private int smInServicioMascotaPk;

	//bi-directional many-to-one association to Historial
	@ManyToOne
	@JoinColumn(name="h_in_historial_fk")
	private Historial historial;

	//bi-directional many-to-one association to Trabajador
	@ManyToOne
	@JoinColumn(name="t_in_trabajador_fk")
	private Trabajador trabajador;

	//bi-directional many-to-one association to ValorServicio
	@OneToMany(mappedBy="servicioMascota")
	private List<ValorServicio> valorServicios;

	public ServicioMascota() {
	}

	public int getSmInServicioMascotaPk() {
		return this.smInServicioMascotaPk;
	}

	public void setSmInServicioMascotaPk(int smInServicioMascotaPk) {
		this.smInServicioMascotaPk = smInServicioMascotaPk;
	}

	public Historial getHistorial() {
		return this.historial;
	}

	public void setHistorial(Historial historial) {
		this.historial = historial;
	}

	public Trabajador getTrabajador() {
		return this.trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	public List<ValorServicio> getValorServicios() {
		return this.valorServicios;
	}

	public void setValorServicios(List<ValorServicio> valorServicios) {
		this.valorServicios = valorServicios;
	}

	public ValorServicio addValorServicio(ValorServicio valorServicio) {
		getValorServicios().add(valorServicio);
		valorServicio.setServicioMascota(this);

		return valorServicio;
	}

	public ValorServicio removeValorServicio(ValorServicio valorServicio) {
		getValorServicios().remove(valorServicio);
		valorServicio.setServicioMascota(null);

		return valorServicio;
	}

}