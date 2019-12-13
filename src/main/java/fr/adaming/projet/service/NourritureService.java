package fr.adaming.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projet.model.Nourriture;
import fr.adaming.projet.repository.INourritureRepository;

@Service
public class NourritureService implements INourritureService {

	@Autowired
	INourritureRepository nourritureRepository;
	
	@Override
	public Nourriture saveOrUpdateNourriture(Nourriture nourriture) {
		return nourritureRepository.save(nourriture);
	}

	@Override
	public boolean deleteNourriture(long idNourriture) {
		nourritureRepository.deleteById(idNourriture);
		return true;
	}

	@Override
	public List<Nourriture> getAllNourriture() {
		return nourritureRepository.findAll();
	}

	@Override
	public Nourriture getNourritureById(long idNourriture) {
		return nourritureRepository.findById(idNourriture).get();
	}

}
