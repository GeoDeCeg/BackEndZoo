package fr.adaming.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.projet.model.Nourriture;


public interface INourritureRepository extends JpaRepository<Nourriture, Long> {

}
