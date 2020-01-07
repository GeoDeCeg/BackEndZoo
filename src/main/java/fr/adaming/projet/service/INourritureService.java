package fr.adaming.projet.service;

import java.util.List;

import fr.adaming.projet.model.Nourriture;

public interface INourritureService {
	
	public Nourriture saveOrUpdateNourriture (Nourriture nourriture);
	
	public boolean deleteNourriture (long idNourriture);
	
	public List<Nourriture> getAllNourriture ();
	
	public Nourriture getNourritureById (long idNourriture);
	
	public long count();
}
