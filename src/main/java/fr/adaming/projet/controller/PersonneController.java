package fr.adaming.projet.controller;

import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


import fr.adaming.projet.model.Personne;
import fr.adaming.projet.model.Token;
import fr.adaming.projet.service.IPersonneService;
import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;


@RestController
@RequestMapping("personne")
@CrossOrigin("http://localhost:4200")
public class PersonneController {

	Key cle = Keys.secretKeyFor(SignatureAlgorithm.HS256);
	
	@Autowired
	IPersonneService personneService;
	
	@GetMapping("/count")
	public long count () {
		return personneService.count();
	}

	@GetMapping
	public List<Personne> getAllPersonne() {
		return personneService.getAllPersonne();
	}

	@GetMapping("/{idPersonne}")
	public Personne getPersonneById(@PathVariable long idPersonne) {
		return personneService.getPersonneById(idPersonne);
	}

	@PostMapping
	public Personne addPersonne(@RequestBody Personne personne) {
		return personneService.saveOrUpdatePersonne(personne);
	}

	@PutMapping("/{idPersonne}")
	public boolean updatePersonne(@RequestBody Personne personne, @PathVariable long idPersonne) {
		personne.setIdPersonne(idPersonne);
		personneService.saveOrUpdatePersonne(personne);
		return true;
	}

	@DeleteMapping("/{idPersonne}")
	public boolean deletePersonne(@PathVariable long idPersonne) {
		personneService.deletePersonne(idPersonne);
		return true;
	}

	@PutMapping("/role/{idPersonne}/{idRole}")
	public boolean affecterRolePersonne(@PathVariable long idPersonne,@PathVariable long idRole) {
		personneService.affecterRolePersonne(idPersonne, idRole);
		return true;
	}

	@PutMapping("/zone/{idPersonne}/{idZone}")
	public boolean affecterZonePersonne(@PathVariable long idPersonne,@PathVariable long idZone) {
		personneService.affecterZonePersonne(idPersonne, idZone);
		return true;
	}
	
	@PutMapping("/all/{idPersonne}/{idRole}/{idZone}")
	public boolean affecterPersonne(@PathVariable long idPersonne,@PathVariable long idRole,@PathVariable long idZone) {
		personneService.affecterZonePersonne(idPersonne, idZone);
		personneService.affecterRolePersonne(idPersonne, idRole);
//		personneService.affecterTachePersonne(idPersonne, idTache);
		return true;
	}
	
	@PostMapping("/login")
	public Token findByLoginAndMdp(@RequestBody Personne personne) {
		Personne p =  personneService.findByLoginAndPassword(personne.getLogin(), personne.getPassword());
		if (p.getIdPersonne() != 0 ) {
		String token;
		Map<String, Object> claims = new HashMap<String, Object>();
		claims.put("id", p.getIdPersonne());
		claims.put("nom", p.getNom());
		claims.put("prenom", p.getPrenom());
		claims.put("email", p.getEmail());
		claims.put("login", p.getLogin());
		claims.put("role", p.getRole());
		claims.put("zone", p.getZone());
		token = Jwts.builder().addClaims(claims).signWith(cle).compact();
		Token t = new Token();
		t.setToken(token);
		return t;
		}
		return null;
	}
	

}
