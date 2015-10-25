package com.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the especie database table.
 * 
 */
@Entity
@NamedQuery(name="Especie.findAll", query="SELECT e FROM Especie e")
public class Especie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="e_in_especie_pk")
	private int eInEspeciePk;

	@Column(name="e_in_nombre")
	private String eInNombre;

	@Column(name="e_in_status")
	private int eInStatus;

	//bi-directional many-to-one association to Mascota
	@OneToMany(mappedBy="especie")
	private List<Mascota> mascotas;

	public Especie() {
	}

	public int getEInEspeciePk() {
		return this.eInEspeciePk;
	}

	public void setEInEspeciePk(int eInEspeciePk) {
		this.eInEspeciePk = eInEspeciePk;
	}

	public String getEInNombre() {
		return this.eInNombre;
	}

	public void setEInNombre(String eInNombre) {
		this.eInNombre = eInNombre;
	}

	public int getEInStatus() {
		return this.eInStatus;
	}

	public void setEInStatus(int eInStatus) {
		this.eInStatus = eInStatus;
	}

	public List<Mascota> getMascotas() {
		return this.mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public Mascota addMascota(Mascota mascota) {
		getMascotas().add(mascota);
		mascota.setEspecie(this);

		return mascota;
	}

	public Mascota removeMascota(Mascota mascota) {
		getMascotas().remove(mascota);
		mascota.setEspecie(null);

		return mascota;
	}

}