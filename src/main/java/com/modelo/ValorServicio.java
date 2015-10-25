package com.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the valor_servicio database table.
 * 
 */
@Entity
@Table(name="valor_servicio")
@NamedQuery(name="ValorServicio.findAll", query="SELECT v FROM ValorServicio v")
public class ValorServicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="vs_in_valor_servicio_pk")
	private int vsInValorServicioPk;

	@Column(name="vs_st_valor")
	private String vsStValor;

	//bi-directional many-to-one association to NombreCampo
	@ManyToOne
	@JoinColumn(name="nc_in_detalle_servicio_fk")
	private NombreCampo nombreCampo;

	//bi-directional many-to-one association to ServicioMascota
	@ManyToOne
	@JoinColumn(name="sm_in_servicio_mascota_fk")
	private ServicioMascota servicioMascota;

	public ValorServicio() {
	}

	public int getVsInValorServicioPk() {
		return this.vsInValorServicioPk;
	}

	public void setVsInValorServicioPk(int vsInValorServicioPk) {
		this.vsInValorServicioPk = vsInValorServicioPk;
	}

	public String getVsStValor() {
		return this.vsStValor;
	}

	public void setVsStValor(String vsStValor) {
		this.vsStValor = vsStValor;
	}

	public NombreCampo getNombreCampo() {
		return this.nombreCampo;
	}

	public void setNombreCampo(NombreCampo nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

	public ServicioMascota getServicioMascota() {
		return this.servicioMascota;
	}

	public void setServicioMascota(ServicioMascota servicioMascota) {
		this.servicioMascota = servicioMascota;
	}

}