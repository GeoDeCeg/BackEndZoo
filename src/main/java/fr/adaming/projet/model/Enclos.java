package fr.adaming.projet.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name="tb_enclos")
public class Enclos implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private long idEnclos;
	private int numero;
	private int capacite;
	private Zone zone;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdEnclos() {
		return idEnclos;
	}
	
	public void setIdEnclos(long idEnclos) {
		this.idEnclos = idEnclos;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getCapacite() {
		return capacite;
	}
	
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	@ManyToOne
	@JoinColumn(name="id_zone")
	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	@Override
	public String toString() {
		return "Enclos [idEnclos=" + idEnclos + ", numero=" + numero + ", capacite=" + capacite + "]";
	}
	
	
	
	

}
