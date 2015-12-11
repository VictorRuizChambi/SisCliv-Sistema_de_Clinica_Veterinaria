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
 * The persistent class for the nombre_campo database table.
 * 
 */
@Entity
@Table(name="nombre_campo")
@NamedQuery(name="NombreCampo.findAll", query="SELECT n FROM NombreCampo n")
public class NombreCampo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="nc_in_detalle_servicio_pk")
	private int ncInDetalleServicioPk;

	@Column(name="nc_st_nombre")
	private String ncStNombre;

	//bi-directional many-to-one association to Servicio
	@ManyToOne
	@JoinColumn(name="s_in_servicio_fk")
	private Servicio servicio;

	//bi-directional many-to-one association to TipoCampo
	@ManyToOne
	@JoinColumn(name="tc_in_tipo_campo_fk")
	private TipoCampo tipoCampo;

	//bi-directional many-to-one association to ValorServicio
	@Exclude
	@OneToMany(mappedBy="nombreCampo")
	private List<ValorServicio> valorServicios;

	public NombreCampo() {
	}

	public int getNcInDetalleServicioPk() {
		return this.ncInDetalleServicioPk;
	}

	public void setNcInDetalleServicioPk(int ncInDetalleServicioPk) {
		this.ncInDetalleServicioPk = ncInDetalleServicioPk;
	}

	public String getNcStNombre() {
		return this.ncStNombre;
	}

	public void setNcStNombre(String ncStNombre) {
		this.ncStNombre = ncStNombre;
	}

	public Servicio getServicio() {
		return this.servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public TipoCampo getTipoCampo() {
		return this.tipoCampo;
	}

	public void setTipoCampo(TipoCampo tipoCampo) {
		this.tipoCampo = tipoCampo;
	}

	public List<ValorServicio> getValorServicios() {
		return this.valorServicios;
	}

	public void setValorServicios(List<ValorServicio> valorServicios) {
		this.valorServicios = valorServicios;
	}

	public ValorServicio addValorServicio(ValorServicio valorServicio) {
		getValorServicios().add(valorServicio);
		valorServicio.setNombreCampo(this);

		return valorServicio;
	}

	public ValorServicio removeValorServicio(ValorServicio valorServicio) {
		getValorServicios().remove(valorServicio);
		valorServicio.setNombreCampo(null);

		return valorServicio;
	}

}