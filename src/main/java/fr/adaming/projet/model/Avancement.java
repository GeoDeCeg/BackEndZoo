package fr.adaming.projet.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tb_avancement")
public class Avancement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long idAvancement;
	private String libelle;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdAvancement() {
		return idAvancement;
	}
	
	public void setIdAvancement(long idAvancement) {
		this.idAvancement = idAvancement;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Avancement [idAvancement=" + idAvancement + ", libelle=" + libelle + "]";
	}
	
	
	

}
