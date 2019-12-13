package fr.adaming.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projet.model.Animal;
import fr.adaming.projet.model.Enclos;
import fr.adaming.projet.model.Nourriture;
import fr.adaming.projet.repository.IAnimalRepository;
import fr.adaming.projet.repository.IEnclosRepository;
import fr.adaming.projet.repository.INourritureRepository;

@Service
public class AnimalService implements IAnimalService {
	
	@Autowired
	IAnimalRepository animalRepository;
	@Autowired
	IEnclosRepository enclosRepository;
	@Autowired
	INourritureRepository nourritureRepository;
	
	@Override
	public Animal saveOrUpdateAnimal(Animal animal) {
		return animalRepository.save(animal);
	}

	@Override
	public boolean deleteAnimal(long idAnimal) {
		animalRepository.deleteById(idAnimal);
		return true;
	}

	@Override
	public List<Animal> getAllAnimal() {
		return animalRepository.findAll();
	}

	@Override
	public Animal getAnimalById(long idAnimal) {
		return animalRepository.findById(idAnimal).get();
	}

	@Override
	public boolean affecterEnclosAnimal(long idAnimal, long idEnclos) {
		Animal animal = new Animal();
		Enclos enclos = new Enclos();
		
		animal = animalRepository.findById(idAnimal).get();
		enclos = enclosRepository.findById(idEnclos).get();
		
		animal.setEnclos(enclos);
		animalRepository.save(animal);
		return true;
	}

	@Override
	public boolean affecterNourritureAnimal(long idAnimal, long idNourriture) {
		Animal animal = new Animal();
		Nourriture nourriture = new Nourriture();
		
		animal = animalRepository.findById(idAnimal).get();
		nourriture = nourritureRepository.findById(idNourriture).get();		
		
		animal.setNourriture(nourriture);
		animalRepository.save(animal);
		return true;
	}

}
