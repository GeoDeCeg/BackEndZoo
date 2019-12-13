package fr.adaming.projet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.adaming.projet.model.Animal;
import fr.adaming.projet.model.Avancement;
import fr.adaming.projet.model.Enclos;
import fr.adaming.projet.model.Nourriture;
import fr.adaming.projet.model.Personne;
import fr.adaming.projet.model.Role;
import fr.adaming.projet.model.Tache;
import fr.adaming.projet.model.Zone;
import fr.adaming.projet.service.AnimalService;
import fr.adaming.projet.service.IAnimalService;
import fr.adaming.projet.service.IAvancementService;
import fr.adaming.projet.service.IEnclosService;
import fr.adaming.projet.service.INourritureService;
import fr.adaming.projet.service.IPersonneService;
import fr.adaming.projet.service.IRoleService;
import fr.adaming.projet.service.ITacheService;
import fr.adaming.projet.service.IZoneService;

@SpringBootApplication
public class ProjetFinZooApplication implements CommandLineRunner {
	
	@Autowired
	IAnimalService animalService;
	@Autowired
	IAvancementService avancementService;
	@Autowired
	IEnclosService enclosService;
	@Autowired
	INourritureService nourritureService;
	@Autowired
	IPersonneService personneService;
	@Autowired
	IRoleService roleService;
	@Autowired
	ITacheService tacheService;
	@Autowired
	IZoneService zoneService;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(ProjetFinZooApplication.class, args);
				
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Override en marche");
		
		
		
	}

}
