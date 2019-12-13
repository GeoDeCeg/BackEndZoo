package fr.adaming.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.projet.model.Personne;


public interface IPersonneRepository extends JpaRepository<Personne, Long>{

}
