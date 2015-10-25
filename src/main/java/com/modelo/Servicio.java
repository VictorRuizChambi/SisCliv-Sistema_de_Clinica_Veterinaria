package com.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the servicio database table.
 * 
 */
@Entity
@NamedQuery(name="Servicio.findAll", query="SELECT s FROM Servicio s")
public class Servicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="s_in_servicio_pk")
	private int sInServicioPk;

	@Column(name="s_db_precio")
	private double sDbPrecio;

	@Column(name="s_st_descripcion")
	private String sStDescripcion;

	@Column(name="s_st_nombre")
	private String sStNombre;

	//bi-directional many-to-one association to NombreCampo
	@OneToMany(mappedBy="servicio")
	private List<NombreCampo> nombreCampos;

	//bi-directional many-to-one association to Opcion
	@ManyToOne
	@JoinColumn(name="o_in_opcion_fk")
	private Opcion opcion;

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

	public List<NombreCampo> getNombreCampos() {
		return this.nombreCampos;
	}

	public void setNombreCampos(List<NombreCampo> nombreCampos) {
		this.nombreCampos = nombreCampos;
	}

	public NombreCampo addNombreCampo(NombreCampo nombreCampo) {
		getNombreCampos().add(nombreCampo);
		nombreCampo.setServicio(this);

		return nombreCampo;
	}

	public NombreCampo removeNombreCampo(NombreCampo nombreCampo) {
		getNombreCampos().remove(nombreCampo);
		nombreCampo.setServicio(null);

		return nombreCampo;
	}

	public Opcion getOpcion() {
		return this.opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}

}