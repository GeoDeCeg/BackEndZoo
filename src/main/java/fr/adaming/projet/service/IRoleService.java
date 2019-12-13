package fr.adaming.projet.service;

import java.util.List;

import fr.adaming.projet.model.Role;

public interface IRoleService {
	
	public Role saveOrUpdateRole (Role role);
	
	public boolean deleteRole (long idRole);
	
	public List<Role> getAllRole();
	
	public Role getRoleById (long idRole);

}
