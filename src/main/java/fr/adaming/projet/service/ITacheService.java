package fr.adaming.projet.service;

import java.util.List;

import fr.adaming.projet.model.Tache;

public interface ITacheService {
	
	public Tache saveOrUpdateService(Tache tache);
	
	public boolean deleteTache (long idTache);
	
	public List<Tache> getAllTache ();
	
	public Tache getTacheById (long idTache);
	
	public List<Tache> getTacheByIdPersonne (long idPersonne);
	
	public boolean affecterAvancementTache (long idTache, long idAvancement);
	
	public boolean affecterPersonneTache (long idTache, long idPersonne);
	
	public long count();

}
