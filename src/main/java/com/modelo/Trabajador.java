package com.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the trabajador database table.
 * 
 */
@Entity
@NamedQuery(name="Trabajador.findAll", query="SELECT t FROM Trabajador t")
public class Trabajador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="t_in_trabajador_pk")
	private int tInTrabajadorPk;

	@Column(name="t_ch_sexo")
	private String tChSexo;

	@Temporal(TemporalType.DATE)
	@Column(name="t_dt_fecha_nacimiento")
	private Date tDtFechaNacimiento;

	@Column(name="t_in_dni")
	private int tInDni;

	@Column(name="t_in_status")
	private int tInStatus;

	@Column(name="t_st_apellido_materno")
	private String tStApellidoMaterno;

	@Column(name="t_st_apellido_paterno")
	private String tStApellidoPaterno;

	@Column(name="t_st_correo")
	private String tStCorreo;

	@Column(name="t_st_direccion")
	private String tStDireccion;

	@Column(name="t_st_nombres")
	private String tStNombres;

	//bi-directional many-to-one association to ServicioMascota
	@OneToMany(mappedBy="trabajador")
	private List<ServicioMascota> servicioMascotas;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="u_in_usuario_fk")
	private Usuario usuario;

	public Trabajador() {
	}

	public int getTInTrabajadorPk() {
		return this.tInTrabajadorPk;
	}

	public void setTInTrabajadorPk(int tInTrabajadorPk) {
		this.tInTrabajadorPk = tInTrabajadorPk;
	}

	public String getTChSexo() {
		return this.tChSexo;
	}

	public void setTChSexo(String tChSexo) {
		this.tChSexo = tChSexo;
	}

	public Date getTDtFechaNacimiento() {
		return this.tDtFechaNacimiento;
	}

	public void setTDtFechaNacimiento(Date tDtFechaNacimiento) {
		this.tDtFechaNacimiento = tDtFechaNacimiento;
	}

	public int getTInDni() {
		return this.tInDni;
	}

	public void setTInDni(int tInDni) {
		this.tInDni = tInDni;
	}

	public int getTInStatus() {
		return this.tInStatus;
	}

	public void setTInStatus(int tInStatus) {
		this.tInStatus = tInStatus;
	}

	public String getTStApellidoMaterno() {
		return this.tStApellidoMaterno;
	}

	public void setTStApellidoMaterno(String tStApellidoMaterno) {
		this.tStApellidoMaterno = tStApellidoMaterno;
	}

	public String getTStApellidoPaterno() {
		return this.tStApellidoPaterno;
	}

	public void setTStApellidoPaterno(String tStApellidoPaterno) {
		this.tStApellidoPaterno = tStApellidoPaterno;
	}

	public String getTStCorreo() {
		return this.tStCorreo;
	}

	public void setTStCorreo(String tStCorreo) {
		this.tStCorreo = tStCorreo;
	}

	public String getTStDireccion() {
		return this.tStDireccion;
	}

	public void setTStDireccion(String tStDireccion) {
		this.tStDireccion = tStDireccion;
	}

	public String getTStNombres() {
		return this.tStNombres;
	}

	public void setTStNombres(String tStNombres) {
		this.tStNombres = tStNombres;
	}

	public List<ServicioMascota> getServicioMascotas() {
		return this.servicioMascotas;
	}

	public void setServicioMascotas(List<ServicioMascota> servicioMascotas) {
		this.servicioMascotas = servicioMascotas;
	}

	public ServicioMascota addServicioMascota(ServicioMascota servicioMascota) {
		getServicioMascotas().add(servicioMascota);
		servicioMascota.setTrabajador(this);

		return servicioMascota;
	}

	public ServicioMascota removeServicioMascota(ServicioMascota servicioMascota) {
		getServicioMascotas().remove(servicioMascota);
		servicioMascota.setTrabajador(null);

		return servicioMascota;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}