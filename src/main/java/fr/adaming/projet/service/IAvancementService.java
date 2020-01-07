package fr.adaming.projet.service;

import java.util.List;

import fr.adaming.projet.model.Avancement;

public interface IAvancementService {

	public Avancement saveOrUpdateAvancement (Avancement avancement);
	
	public boolean deleteAvancement (long idAvancement);
	
	public List<Avancement> getAllAvancement();
	
	public Avancement getAvancementById(long idAvancement);
	
	public long count();
}
