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

import fr.adaming.projet.model.Enclos;
import fr.adaming.projet.service.IEnclosService;

@RestController
@RequestMapping("enclos")
@CrossOrigin("http://localhost:4200")
public class EnclosController {
	
	@Autowired
	IEnclosService enclosService;
	
	@GetMapping("/count")
	public long count() {
		return enclosService.count();
	}
	
	@PostMapping
	public Enclos AddEnclos (@RequestBody Enclos enclos) {
		return enclosService.saveOrUpdateEnclos(enclos);
	}
	
	@PutMapping("/{idEnclos}")
	public boolean updateEnclos (@RequestBody Enclos enclos,@PathVariable long idEnclos) {
		enclos.setIdEnclos(idEnclos);
		enclosService.saveOrUpdateEnclos(enclos);
		return true;
	}
	
	@DeleteMapping("/{idEnclos}")
	public boolean deleteEnclos (@PathVariable long idEnclos) {
		enclosService.deleteEnclos(idEnclos);
		return true;
	}
	
	@GetMapping
	public List<Enclos> getAllEnclos(){
		return enclosService.getAllEnclos();
	}
	
	@GetMapping("/{idEnclos}")
	public Enclos getEnclosById(@PathVariable long idEnclos) {
		return enclosService.getEnclosById(idEnclos);
	}
	
	@PutMapping("/zone/{idEnclos}/{idZone}")
	public boolean affecterZoneEnclos(@PathVariable long idEnclos,@PathVariable long idZone) {
		enclosService.affecterZoneEnclos(idEnclos, idZone);
		return true;
	}

}
