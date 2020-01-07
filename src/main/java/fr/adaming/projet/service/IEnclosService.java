package fr.adaming.projet.service;

import java.util.List;

import fr.adaming.projet.model.Enclos;

public interface IEnclosService {
	
	public Enclos saveOrUpdateEnclos (Enclos enclos);
	
	public boolean deleteEnclos (long idEnclos);
	
	public List<Enclos> getAllEnclos();
	
	public Enclos getEnclosById(long idEnclos);
	
	public boolean affecterZoneEnclos(long idEnclos, long idZone);
	
	public long count();

}
