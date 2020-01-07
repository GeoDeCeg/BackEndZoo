package fr.adaming.projet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.projet.model.Tache;


public interface ITacheRepository extends JpaRepository<Tache, Long> {
	

}
