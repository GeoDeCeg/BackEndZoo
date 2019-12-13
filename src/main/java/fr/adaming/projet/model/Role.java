package fr.adaming.projet.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tb_role")
public class Role implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private long idRole;
	private String libelle;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdRole() {
		return idRole;
	}
	
	public void setIdRole(long idRole) {
		this.idRole = idRole;
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
		return "Role [idRole=" + idRole + ", libelle=" + libelle + "]";
	}
	
	
	
	

}
