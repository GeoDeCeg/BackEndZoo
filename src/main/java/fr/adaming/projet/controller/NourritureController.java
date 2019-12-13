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

import fr.adaming.projet.model.Nourriture;
import fr.adaming.projet.service.INourritureService;

@RestController
@RequestMapping("nourriture")
@CrossOrigin("http://localhost:4200")
public class NourritureController {
	
	@Autowired
	INourritureService nourritureService;
	
	@PostMapping
	public Nourriture addNourriture (@RequestBody Nourriture nourriture) {
		return nourritureService.saveOrUpdateNourriture(nourriture);
	}
	
	@PutMapping("/{idNourriture}")
	public boolean updateNourrture (@RequestBody Nourriture nourriture,@PathVariable long idNourriture) {
		nourriture.setIdNourriture(idNourriture);
		nourritureService.saveOrUpdateNourriture(nourriture);
		return true;
	}
	
	@DeleteMapping("/{idNourriture}")
	public boolean deleteNourriture (@PathVariable long idNourriture) {
		nourritureService.deleteNourriture(idNourriture);
		return true;
	}
	
	@GetMapping
	public List<Nourriture> getAllNourriture (){
		return nourritureService.getAllNourriture();
	}
	
	@GetMapping("/{idNourriture}")
	public Nourriture getNourritureById (@PathVariable long idNourriture) {
		return nourritureService.getNourritureById(idNourriture);
	}
	

}
