package fr.adaming.projet.service;

import java.util.List;

import fr.adaming.projet.model.Personne;

public interface IPersonneService {
	
	public Personne saveOrUpdatePersonne(Personne personne);
	
	public boolean deletePersonne (long idPersonne);
	
	public List<Personne> getAllPersonne ();
	
	public Personne getPersonneById (long idPersonne);
	
	
	public boolean affecterRolePersonne (long idPersonne, long idRole);
	
	public boolean affecterZonePersonne (long idPersonne, long idZone);
	
	public long count();

}
