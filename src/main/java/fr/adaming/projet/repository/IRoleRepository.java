package fr.adaming.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.projet.model.Role;


public interface IRoleRepository extends JpaRepository<Role, Long> {

}
