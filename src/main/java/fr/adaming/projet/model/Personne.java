package fr.adaming.projet.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="tb_personne")
public class Personne implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private long idPersonne;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private String email;
	private Tache tache;
	private Zone zone;
	private Role role;
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdPersonne() {
		return idPersonne;
	}
	
	public void setIdPersonne(long idPersonne) {
		this.idPersonne = idPersonne;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
		
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@ManyToOne
	@JoinColumn(name="id_tache")
	public Tache getTache() {
		return tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}
	
	@ManyToOne
	@JoinColumn(name="id_zone")
	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	@OneToOne
	@JoinColumn(name="id_role")
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Staff [idPersonne=" + idPersonne + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password="
				+ password + "]";
	}
	
	
	
	
	

}
