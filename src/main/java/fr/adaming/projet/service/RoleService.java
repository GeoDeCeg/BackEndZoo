package fr.adaming.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.projet.model.Role;
import fr.adaming.projet.repository.IRoleRepository;

@Service
public class RoleService implements IRoleService {
	
	@Autowired
	IRoleRepository roleRepository;

	@Override
	public Role saveOrUpdateRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public boolean deleteRole(long idRole) {
		roleRepository.deleteById(idRole);
		return true;
	}

	@Override
	public List<Role> getAllRole() {
		return roleRepository.findAll();
	}

	@Override
	public Role getRoleById(long idRole) {
		return roleRepository.findById(idRole).get();
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return roleRepository.count();
	}

}
