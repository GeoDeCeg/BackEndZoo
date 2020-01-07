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

import fr.adaming.projet.model.Avancement;
import fr.adaming.projet.service.IAvancementService;

@RestController
@RequestMapping("avancement")
@CrossOrigin("http://localhost:4200")
public class AvancementController {
	
	@Autowired
	IAvancementService avancementService;
	
	@GetMapping("/count")
	public long count() {
		return avancementService.count();
	}
	
	@PostMapping
	public Avancement addAvancement (@RequestBody Avancement avancement) {
		return avancementService.saveOrUpdateAvancement(avancement);
	}
	
	@PutMapping("/{idAvancement}")
	public boolean updateAvancement (@RequestBody Avancement avancement,@PathVariable long idAvancement) {
		avancement.setIdAvancement(idAvancement);
		avancementService.saveOrUpdateAvancement(avancement);
		return true;
		
	}
	
	@DeleteMapping("/{idAvancement}")
	public boolean deleteAvancement (@PathVariable long idAvancement) {
		avancementService.deleteAvancement(idAvancement);
		return true;
		
	}
	
	@GetMapping
	public List<Avancement> getAllAvancement(){
		return avancementService.getAllAvancement();
	}
	
	@GetMapping("/{idAvancement}")
	public Avancement getAvancementById(@PathVariable long idAvancement) {
		return avancementService.getAvancementById(idAvancement);
		
	}

}
