package fr.adaming.projet.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="tb_zone")
public class Zone implements Serializable{

	private static final long serialVersionUID = 1L;
	private long idZone;
	private String nom;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdZone() {
		return idZone;
	}
	
	public void setIdZone(long idZone) {
		this.idZone = idZone;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Zone [idZone=" + idZone + ", nom=" + nom + "]";
	}
	
	
	
		

}
