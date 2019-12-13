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
@Table (name="tb_animal")
public class Animal implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private long idAnimal;
	private String nom;
	private String famille;
	private int age;
	private Enclos enclos;
	private Nourriture nourriture;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdAnimal() {
		return idAnimal;
	}
	
	public void setIdAnimal(long idAnimal) {
		this.idAnimal = idAnimal;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getFamille() {
		return famille;
	}
	
	public void setFamille(String famille) {
		this.famille = famille;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	@ManyToOne
	@JoinColumn(name="id_enclos")
	public Enclos getEnclos() {
		return enclos;
	}

	public void setEnclos(Enclos enclos) {
		this.enclos = enclos;
	}
	
	
	@ManyToOne
	@JoinColumn(name="id_nourriture")
	public Nourriture getNourriture() {
		return nourriture;
	}

	public void setNourriture(Nourriture nourriture) {
		this.nourriture = nourriture;
	}

	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", nom=" + nom + ", famille=" + famille + ", age=" + age + "]";
	}
	
	
	
	
	
	

}
