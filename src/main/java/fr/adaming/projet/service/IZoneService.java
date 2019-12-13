package fr.adaming.projet.service;

import java.util.List;

import fr.adaming.projet.model.Zone;

public interface IZoneService {
	
	public Zone saveOrUpdateZone (Zone zone);
	
	public boolean deleteZone (long idZone);
	
	public List<Zone> getAllZone();
	
	public Zone getZoneById(long idZone);

}
