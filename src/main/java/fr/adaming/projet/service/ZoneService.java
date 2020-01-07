package fr.adaming.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projet.model.Zone;
import fr.adaming.projet.repository.IZoneRepository;

@Service
public class ZoneService implements IZoneService{

	@Autowired
	IZoneRepository zoneRepository;
	
	@Override
	public Zone saveOrUpdateZone(Zone zone) {
		return zoneRepository.save(zone);
	}

	@Override
	public boolean deleteZone(long idZone) {
		zoneRepository.deleteById(idZone);
		return true;
	}

	@Override
	public List<Zone> getAllZone() {
		return zoneRepository.findAll();
	}

	@Override
	public Zone getZoneById(long idZone) {
		return zoneRepository.findById(idZone).get();
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return zoneRepository.count();
	}

}
