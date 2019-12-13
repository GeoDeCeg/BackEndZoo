package fr.adaming.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projet.model.Enclos;
import fr.adaming.projet.model.Zone;
import fr.adaming.projet.repository.IEnclosRepository;
import fr.adaming.projet.repository.IZoneRepository;

@Service
public class EnclosService implements IEnclosService {
	
	@Autowired
	IEnclosRepository enclosRepository;
	@Autowired
	IZoneRepository zoneRepository;

	@Override
	public Enclos saveOrUpdateEnclos(Enclos enclos) {
		return enclosRepository.save(enclos);
	}

	@Override
	public boolean deleteEnclos(long idEnclos) {
		enclosRepository.deleteById(idEnclos);
		return true;
	}

	@Override
	public List<Enclos> getAllEnclos() {
		return enclosRepository.findAll();
	}

	@Override
	public Enclos getEnclosById(long idEnclos) {
		return enclosRepository.findById(idEnclos).get();
	}

	@Override
	public boolean affecterZoneEnclos(long idEnclos, long idZone) {
		Enclos enclos = new Enclos();
		Zone zone = new Zone();
		
		enclos = enclosRepository.findById(idEnclos).get();
		zone = zoneRepository.findById(idZone).get();
		
		enclos.setZone(zone);
		enclosRepository.save(enclos);
		
		return true;
		
	}

}
