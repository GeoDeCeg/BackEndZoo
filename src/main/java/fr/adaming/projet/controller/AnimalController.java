package fr.adaming.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.projet.model.Animal;
import fr.adaming.projet.service.IAnimalService;

@RestController
@RequestMapping("animal")
@CrossOrigin("http://localhost:4200")
public class AnimalController {

	@Autowired
	IAnimalService animalService;
	
	@GetMapping
	public List<Animal> getAllAnimal(){
		return animalService.getAllAnimal();
	}
	
	@GetMapping("/{idAnimal}")
	public Animal getAnimalById(@PathVariable long idAnimal) {
		return animalService.getAnimalById(idAnimal);
	}
	
	@PostMapping
	public Animal addAnimal(@RequestBody Animal animal) {
		return animalService.saveOrUpdateAnimal(animal);
	}
	
	@PutMapping("/{idAnimal}")
	public boolean updateAnimal (@RequestBody Animal animal, @PathVariable long idAnimal) {
		animal.setIdAnimal(idAnimal);
		animalService.saveOrUpdateAnimal(animal);
		return true;
	}
	
	@DeleteMapping("/{idAnimal}")
	public boolean deleteAnimal(@PathVariable long idAnimal) {
		animalService.deleteAnimal(idAnimal);
		return true;
	}
	
	@PutMapping("/enclos/{idAnimal}/{idEnclos}")
	public boolean affecterEnclosAnimal (@PathVariable long idAnimal,@PathVariable long idEnclos) {
		animalService.affecterEnclosAnimal(idAnimal, idEnclos);
		return true;
	}
	
	@PutMapping("/nourriture/{idAnimal}/{idNourriture}")
	public boolean affecterNourritureAnimal (@PathVariable long idAnimal,@PathVariable long idNourriture) {
		animalService.affecterNourritureAnimal(idAnimal, idNourriture);
		return true;
	}
	
	
}
