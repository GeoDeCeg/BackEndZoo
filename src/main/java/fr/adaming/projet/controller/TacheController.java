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

import fr.adaming.projet.model.Tache;
import fr.adaming.projet.service.ITacheService;

@RestController
@RequestMapping("tache")
@CrossOrigin("http://localhost:4200")
public class TacheController {
	
	@Autowired
	ITacheService tacheService;
	
	@GetMapping("/count")
	public long count () {
		return tacheService.count();
	}
	
	@GetMapping("/byP/{idPersonne}")
	public List<Tache> getTacheByIdPersonne (@PathVariable long idPersonne){
		
		return tacheService.getTacheByIdPersonne(idPersonne);
	}
	
	@PostMapping
	public Tache addTache(@RequestBody Tache tache) {
		return tacheService.saveOrUpdateService(tache);
		
	}
	
	@PutMapping("/{idTache}")
	public boolean updateTache(@RequestBody Tache tache,@PathVariable long idTache) {
		tache.setIdTache(idTache);
		tacheService.saveOrUpdateService(tache);
		return true;
	}
	
	@DeleteMapping("/{idTache}")
	public boolean deleteTache (@PathVariable long idTache) {
		tacheService.deleteTache(idTache);
		return true;
	}
	
	@GetMapping
	public List<Tache> getAllTache (){
		return tacheService.getAllTache();
	}
	
	@GetMapping("/{idTache}")
	public Tache getTacheById (@PathVariable long idTache) {
		return tacheService.getTacheById(idTache);
	}
	
	@PutMapping("/avancement/{idTache}/{idAvancement}")
	public boolean affecterAvancementTache (@PathVariable long idTache,@PathVariable long idAvancement) {
		tacheService.affecterAvancementTache(idTache, idAvancement);
		return true;
	}
	
	@PutMapping("/personne/{idTache}/{idPersonne}")
	public boolean affecterPersonneTache (@PathVariable long idTache,@PathVariable long idPersonne) {
		tacheService.affecterPersonneTache(idTache, idPersonne);
		return true;
	}
	
	@PutMapping("/all/{idTache}/{idAvancement}/{idPersonne}")
	public boolean affecterTache(@PathVariable long idTache, @PathVariable long idAvancement, @PathVariable long idPersonne) {
		tacheService.affecterAvancementTache(idTache, idAvancement);
		tacheService.affecterPersonneTache(idTache, idPersonne);
		return true;
	}

}
