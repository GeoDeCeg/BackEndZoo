package fr.adaming.projet.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="tb_tache")
public class Tache implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private long idTache;
	private String activite;
	private Date date;
	private double duree;
	private Avancement avancement;
	private Personne personne;
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdTache() {
		return idTache;
	}
	
	public void setIdTache(long idTache) {
		this.idTache = idTache;
	}
	
	public String getActivite() {
		return activite;
	}
	
	public void setActivite(String activite) {
		this.activite = activite;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public double getDuree() {
		return duree;
	}
	
	public void setDuree(double duree) {
		this.duree = duree;
	}
	
	
	@OneToOne
	@JoinColumn(name="id_avancement")
	public Avancement getAvancement() {
		return avancement;
	}

	public void setAvancement(Avancement avancement) {
		this.avancement = avancement;
	}
	
	
	@ManyToOne
	@JoinColumn(name="id_personne")
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Override
	public String toString() {
		return "Tache [idTache=" + idTache + ", activite=" + activite + ", date=" + date + ", duree=" + duree + "]";
	}
	
	
	

}
