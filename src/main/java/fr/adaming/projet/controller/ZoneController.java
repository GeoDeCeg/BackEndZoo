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

import fr.adaming.projet.model.Zone;
import fr.adaming.projet.service.IZoneService;

@RestController
@RequestMapping("zone")
@CrossOrigin("http://localhost:4200")
public class ZoneController {
	
	@Autowired
	IZoneService zoneService;
	
	@GetMapping("/count")
	public long count() {
		return zoneService.count();
	}
	
	@PostMapping
	public Zone addZone (@RequestBody Zone zone) {
		return zoneService.saveOrUpdateZone(zone);
	}
	
	@PutMapping("/{idZone}")
	public boolean updateZone (@RequestBody Zone zone, @PathVariable long idZone) {
		zone.setIdZone(idZone);
		zoneService.saveOrUpdateZone(zone);
		return true;
	}
	
	@DeleteMapping("/{idZone}")
	public boolean deleteZone (@PathVariable long idZone) {
		zoneService.deleteZone(idZone);
		return true;
	}
	
	@GetMapping
	public List<Zone> getAllZone(){
		return zoneService.getAllZone();
	}
	
	@GetMapping("/{idZone}")
	public Zone getZoneById(@PathVariable long idZone) {
		return zoneService.getZoneById(idZone);
	}

}
