package com.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cita database table.
 * 
 */
@Entity
@NamedQuery(name="Cita.findAll", query="SELECT c FROM Cita c")
public class Cita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ci_int_cita_pk")
	private int ciIntCitaPk;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ci_dt_fecha")
	private Date ciDtFecha;

	@Column(name="ci_int_estado")
	private int ciIntEstado;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	public Cita() {
	}

	public int getCiIntCitaPk() {
		return this.ciIntCitaPk;
	}

	public void setCiIntCitaPk(int ciIntCitaPk) {
		this.ciIntCitaPk = ciIntCitaPk;
	}

	public Date getCiDtFecha() {
		return this.ciDtFecha;
	}

	public void setCiDtFecha(Date ciDtFecha) {
		this.ciDtFecha = ciDtFecha;
	}

	public int getCiIntEstado() {
		return this.ciIntEstado;
	}

	public void setCiIntEstado(int ciIntEstado) {
		this.ciIntEstado = ciIntEstado;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}