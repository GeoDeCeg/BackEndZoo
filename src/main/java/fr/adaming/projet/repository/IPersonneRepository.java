package fr.adaming.projet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.projet.model.Personne;


public interface IPersonneRepository extends JpaRepository<Personne, Long>{
	
	public List<Personne> findByLogin(String login);
	public boolean existsPersonneByLogin (String login);
	public Personne findByLoginAndPassword(String login, String password);

}
