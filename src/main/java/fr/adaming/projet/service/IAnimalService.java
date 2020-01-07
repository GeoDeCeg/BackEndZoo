package fr.adaming.projet.service;

import java.util.List;

import fr.adaming.projet.model.Animal;

public interface IAnimalService {
	
	public Animal saveOrUpdateAnimal(Animal animal);
	
	public boolean deleteAnimal (long idAnimal);
	
	public List<Animal> getAllAnimal();
	
	public Animal getAnimalById(long idAnimal);
	
	public boolean affecterEnclosAnimal (long idAnimal, long idEnclos);
	
	public boolean affecterNourritureAnimal (long idAnimal, long idNourriture);
	
	public boolean affecterAnimal (long idAnimal, long idEnclos, long idNourriture);
	
	public long count();

}
