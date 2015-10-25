package com.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_campo database table.
 * 
 */
@Entity
@Table(name="tipo_campo")
@NamedQuery(name="TipoCampo.findAll", query="SELECT t FROM TipoCampo t")
public class TipoCampo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tc_in_tipo_campo_pk")
	private int tcInTipoCampoPk;

	@Column(name="tc_in_longitud")
	private int tcInLongitud;

	@Column(name="tc_st_nombre")
	private String tcStNombre;

	//bi-directional many-to-one association to NombreCampo
	@OneToMany(mappedBy="tipoCampo")
	private List<NombreCampo> nombreCampos;

	public TipoCampo() {
	}

	public int getTcInTipoCampoPk() {
		return this.tcInTipoCampoPk;
	}

	public void setTcInTipoCampoPk(int tcInTipoCampoPk) {
		this.tcInTipoCampoPk = tcInTipoCampoPk;
	}

	public int getTcInLongitud() {
		return this.tcInLongitud;
	}

	public void setTcInLongitud(int tcInLongitud) {
		this.tcInLongitud = tcInLongitud;
	}

	public String getTcStNombre() {
		return this.tcStNombre;
	}

	public void setTcStNombre(String tcStNombre) {
		this.tcStNombre = tcStNombre;
	}

	public List<NombreCampo> getNombreCampos() {
		return this.nombreCampos;
	}

	public void setNombreCampos(List<NombreCampo> nombreCampos) {
		this.nombreCampos = nombreCampos;
	}

	public NombreCampo addNombreCampo(NombreCampo nombreCampo) {
		getNombreCampos().add(nombreCampo);
		nombreCampo.setTipoCampo(this);

		return nombreCampo;
	}

	public NombreCampo removeNombreCampo(NombreCampo nombreCampo) {
		getNombreCampos().remove(nombreCampo);
		nombreCampo.setTipoCampo(null);

		return nombreCampo;
	}

}