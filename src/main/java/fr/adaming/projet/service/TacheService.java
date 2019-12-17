package fr.adaming.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projet.model.Avancement;
import fr.adaming.projet.model.Personne;
import fr.adaming.projet.model.Tache;
import fr.adaming.projet.repository.IAvancementRepository;
import fr.adaming.projet.repository.IPersonneRepository;
import fr.adaming.projet.repository.ITacheRepository;

@Service
public class TacheService implements ITacheService {
	
	@Autowired
	ITacheRepository tacheRepository;
	@Autowired
	IAvancementRepository avancementRepository;
	@Autowired
	IPersonneRepository personneRepository;

	@Override
	public Tache saveOrUpdateService(Tache tache) {
		return tacheRepository.save(tache);
	}

	@Override
	public boolean deleteTache(long idTache) {
		tacheRepository.deleteById(idTache);
		return true;
	}

	@Override
	public List<Tache> getAllTache() {
		return tacheRepository.findAll();
	}

	@Override
	public Tache getTacheById(long idTache) {
		return tacheRepository.findById(idTache).get();
	}

	@Override
	public boolean affecterAvancementTache(long idTache, long idAvancement) {
		
		Tache tache = new Tache();
		Avancement avancement = new Avancement();
		
		tache = tacheRepository.findById(idTache).get();
		avancement = avancementRepository.findById(idAvancement).get();
		
		tache.setAvancement(avancement);
		tacheRepository.save(tache);		
		
		return true;
	}

	@Override
	public boolean affecterPersonneTache(long idTache, long idPersonne) {
		Tache tache = new Tache();
		Personne personne = new Personne();
		
		tache = tacheRepository.findById(idTache).get();
		personne = personneRepository.findById(idPersonne).get();
		
		tache.setPersonne(personne);
		tacheRepository.save(tache);
		
		return true;
	}

}
