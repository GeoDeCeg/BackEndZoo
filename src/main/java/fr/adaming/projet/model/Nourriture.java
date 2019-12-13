package fr.adaming.projet.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="tb_nourriture")
public class Nourriture implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long idNourriture;
	private int stock;
	private String produit;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdNourriture() {
		return idNourriture;
	}
	public void setIdNourriture(long idNourriture) {
		this.idNourriture = idNourriture;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getProduit() {
		return produit;
	}
	public void setProduit(String produit) {
		this.produit = produit;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
