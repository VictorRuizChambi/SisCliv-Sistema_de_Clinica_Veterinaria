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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.recursos.Exclude;
import com.recursos.SQLConstants.SQLMascota;


/**
 * The persistent class for the mascota database table.
 * 
 */
@Entity
@Table(name="MASCOTA")
@NamedQueries({
@NamedQuery(name=SQLMascota.QUERY_DELETE_BY_MASCOTA_PK, query="UPDATE Mascota m SET m.mInStatus=0 WHERE m.mInMascotaPk=:mInMascotaPk"),
@NamedQuery(name=SQLMascota.QUERY_FIND_BY_STATUS, query="SELECT m FROM Mascota m WHERE m.mInStatus=1")
})
public class Mascota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="m_in_mascota_pk")
	private int mInMascotaPk;

	@Column(name="m_ch_sexo")
	private String mChSexo;

	@Temporal(TemporalType.DATE)
	@Column(name="m_dt_fecha_nacimiento")
	private Date mDtFechaNacimiento;

	@Column(name="m_in_esterilizado")
	private int mInEsterilizado;

	@Column(name="m_in_status")
	private int mInStatus;

	@Column(name="m_st_apellido_materno")
	private String mStApellidoMaterno;

	@Column(name="m_st_apellido_paterno")
	private String mStApellidoPaterno;

	@Column(name="m_st_nombre")
	private String mStNombre;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="c_in_cliente_fk")
	private Cliente cliente;

	//bi-directional many-to-one association to Especie
	@ManyToOne
	@JoinColumn(name="e_in_especie_fk")
	private Especie especie;
	
	//bi-directional many-to-one association to Historial
	@Exclude
	@OneToMany(mappedBy="mascota")
	private List<Historial> historials;

	public List<Historial> getHistorials() {
		return historials;
	}

	public void setHistorials(List<Historial> historials) {
		this.historials = historials;
	}

	public Mascota() {
	}

	public int getMInMascotaPk() {
		return this.mInMascotaPk;
	}

	public void setMInMascotaPk(int mInMascotaPk) {
		this.mInMascotaPk = mInMascotaPk;
	}

	public String getMChSexo() {
		return this.mChSexo;
	}

	public void setMChSexo(String mChSexo) {
		this.mChSexo = mChSexo;
	}

	public Date getMDtFechaNacimiento() {
		return this.mDtFechaNacimiento;
	}

	public void setMDtFechaNacimiento(Date mDtFechaNacimiento) {
		this.mDtFechaNacimiento = mDtFechaNacimiento;
	}

	public int getMInEsterilizado() {
		return this.mInEsterilizado;
	}

	public void setMInEsterilizado(int mInEsterilizado) {
		this.mInEsterilizado = mInEsterilizado;
	}

	public int getMInStatus() {
		return this.mInStatus;
	}

	public void setMInStatus(int mInStatus) {
		this.mInStatus = mInStatus;
	}

	public String getMStApellidoMaterno() {
		return this.mStApellidoMaterno;
	}

	public void setMStApellidoMaterno(String mStApellidoMaterno) {
		this.mStApellidoMaterno = mStApellidoMaterno;
	}

	public String getMStApellidoPaterno() {
		return this.mStApellidoPaterno;
	}

	public void setMStApellidoPaterno(String mStApellidoPaterno) {
		this.mStApellidoPaterno = mStApellidoPaterno;
	}

	public String getMStNombre() {
		return this.mStNombre;
	}

	public void setMStNombre(String mStNombre) {
		this.mStNombre = mStNombre;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Especie getEspecie() {
		return this.especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}


}