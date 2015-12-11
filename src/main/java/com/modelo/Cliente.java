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
import com.recursos.SQLConstants.SQLCliente;
import com.recursos.SQLConstants.SQLUsuario;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@Table(name="CLIENTE")
@NamedQueries({
	@NamedQuery(name=SQLCliente.QUERY_FIND_BY_CLIENTE_BY_STATUS, query="SELECT c FROM Cliente c Where c.cInStatus=:cInStatus"),
	@NamedQuery(name=SQLCliente.QUERY_DELETE_BY_CLIENTE_PK, query="UPDATE Cliente c set c.cInStatus=0 Where c.cInClientePk=:cInClientePk"),
	@NamedQuery(name=SQLCliente.QUERY_FIND_BY_USUARIO_PK, query="SELECT c FROM Cliente c Where c.usuario.uInUsuarioPk=:uInUsuarioPk")
	
})


public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_in_cliente_pk")
	private int cInClientePk;

	@Column(name="c_ch_sexo")
	private String cChSexo;

	@Temporal(TemporalType.DATE)
	@Column(name="c_dt_fecha_nacimiento")
	private Date cDtFechaNacimiento;

	@Column(name="c_in_dni")
	private int cInDni;

	@Column(name="c_in_status")
	private int cInStatus;

	@Column(name="c_in_telefono")
	private int cInTelefono;

	@Column(name="c_st_apellido_materno")
	private String cStApellidoMaterno;

	@Column(name="c_st_apellido_paterno")
	private String cStApellidoPaterno;

	@Column(name="c_st_correo")
	private String cStCorreo;

	@Column(name="c_st_direccion")
	private String cStDireccion;

	@Column(name="c_st_nombres")
	private String cStNombres;

	//bi-directional many-to-one association to Usuario
	
	@ManyToOne
	@JoinColumn(name="u_in_usuario_fk")
	private Usuario usuario;

	//bi-directional many-to-one association to Mascota
	@Exclude
	@OneToMany(mappedBy="cliente")
	private List<Mascota> mascotas;

	public Cliente() {
	}

	public int getCInClientePk() {
		return this.cInClientePk;
	}

	public void setCInClientePk(int cInClientePk) {
		this.cInClientePk = cInClientePk;
	}

	public String getCChSexo() {
		return this.cChSexo;
	}

	public void setCChSexo(String cChSexo) {
		this.cChSexo = cChSexo;
	}

	public Date getCDtFechaNacimiento() {
		return this.cDtFechaNacimiento;
	}

	public void setCDtFechaNacimiento(Date cDtFechaNacimiento) {
		this.cDtFechaNacimiento = cDtFechaNacimiento;
	}

	public int getCInDni() {
		return this.cInDni;
	}

	public void setCInDni(int cInDni) {
		this.cInDni = cInDni;
	}

	public int getCInStatus() {
		return this.cInStatus;
	}

	public void setCInStatus(int cInStatus) {
		this.cInStatus = cInStatus;
	}

	public int getCInTelefono() {
		return this.cInTelefono;
	}

	public void setCInTelefono(int cInTelefono) {
		this.cInTelefono = cInTelefono;
	}

	public String getCStApellidoMaterno() {
		return this.cStApellidoMaterno;
	}

	public void setCStApellidoMaterno(String cStApellidoMaterno) {
		this.cStApellidoMaterno = cStApellidoMaterno;
	}

	public String getCStApellidoPaterno() {
		return this.cStApellidoPaterno;
	}

	public void setCStApellidoPaterno(String cStApellidoPaterno) {
		this.cStApellidoPaterno = cStApellidoPaterno;
	}

	public String getCStCorreo() {
		return this.cStCorreo;
	}

	public void setCStCorreo(String cStCorreo) {
		this.cStCorreo = cStCorreo;
	}

	public String getCStDireccion() {
		return this.cStDireccion;
	}

	public void setCStDireccion(String cStDireccion) {
		this.cStDireccion = cStDireccion;
	}

	public String getCStNombres() {
		return this.cStNombres;
	}

	public void setCStNombres(String cStNombres) {
		this.cStNombres = cStNombres;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Mascota> getMascotas() {
		return this.mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public Mascota addMascota(Mascota mascota) {
		getMascotas().add(mascota);
		mascota.setCliente(this);

		return mascota;
	}

	public Mascota removeMascota(Mascota mascota) {
		getMascotas().remove(mascota);
		mascota.setCliente(null);

		return mascota;
	}

}