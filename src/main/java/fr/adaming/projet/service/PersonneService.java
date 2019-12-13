package fr.adaming.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projet.model.Personne;
import fr.adaming.projet.model.Role;
import fr.adaming.projet.model.Tache;
import fr.adaming.projet.model.Zone;
import fr.adaming.projet.repository.IPersonneRepository;
import fr.adaming.projet.repository.IRoleRepository;
import fr.adaming.projet.repository.ITacheRepository;
import fr.adaming.projet.repository.IZoneRepository;

@Service
public class PersonneService implements IPersonneService {
	
	@Autowired
	IPersonneRepository personneRepository;
	@Autowired
	ITacheRepository tacheRepository;
	@Autowired
	IRoleRepository roleRepository;
	@Autowired
	IZoneRepository zoneRepository;

	@Override
	public Personne saveOrUpdatePersonne(Personne personne) {
		return personneRepository.save(personne);
	}

	@Override
	public boolean deletePersonne(long idPersonne) {
		personneRepository.deleteById(idPersonne);
		return true;
	}

	@Override
	public List<Personne> getAllPersonne() {
		return personneRepository.findAll();
	}

	@Override
	public Personne getPersonneById(long idPersonne) {
		return personneRepository.findById(idPersonne).get();
	}

	@Override
	public boolean affecterTachePersonne(long idPersonne, long idTache) {
		
		Personne personne = new Personne();
		Tache tache = new Tache();
		
		personne = personneRepository.findById(idPersonne).get();
		tache = tacheRepository.findById(idTache).get();
		
		personne.setTache(tache);
		personneRepository.save(personne);		
		
		return true;
		
	}

	@Override
	public boolean affecterRolePersonne(long idPersonne, long idRole) {
		Personne personne = new Personne();
		Role role = new Role();
		
		personne = personneRepository.findById(idPersonne).get();
		role = roleRepository.findById(idRole).get();
		
		personne.setRole(role);
		personneRepository.save(personne);
		
		return true;
	}

	@Override
	public boolean affecterZonePersonne(long idPersonne, long idZone) {
		Personne personne = new Personne ();
		Zone zone = new Zone();
		
		personne = personneRepository.findById(idPersonne).get();
		zone = zoneRepository.findById(idZone).get();
		
		personne.setZone(zone);
		personneRepository.save(personne);
				
		return true;
	}

	

}
