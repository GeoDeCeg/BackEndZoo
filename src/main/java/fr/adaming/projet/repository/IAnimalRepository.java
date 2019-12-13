package fr.adaming.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.projet.model.Animal;

public interface IAnimalRepository extends JpaRepository<Animal, Long> {

}
