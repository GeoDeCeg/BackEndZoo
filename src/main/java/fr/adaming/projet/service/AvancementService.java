package fr.adaming.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projet.model.Avancement;
import fr.adaming.projet.repository.IAvancementRepository;

@Service
public class AvancementService implements IAvancementService{
	
	@Autowired
	IAvancementRepository avancementRepository;

	@Override
	public Avancement saveOrUpdateAvancement(Avancement avancement) {
		return avancementRepository.save(avancement);
	}

	@Override
	public boolean deleteAvancement(long idAvancement) {
		avancementRepository.deleteById(idAvancement);
		return true;
	}

	@Override
	public List<Avancement> getAllAvancement() {
		return avancementRepository.findAll();
	}

	@Override
	public Avancement getAvancementById(long idAvancement) {
		return avancementRepository.findById(idAvancement).get();
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return avancementRepository.count();
	}

}
