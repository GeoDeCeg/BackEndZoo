package fr.adaming.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.projet.model.Role;
import fr.adaming.projet.service.IRoleService;

@RestController
@RequestMapping("role")
@CrossOrigin("http://localhost:4200")
public class RoleController {
	
	@Autowired
	IRoleService roleService;
	
	@GetMapping("/count")
	public long count() {
		return roleService.count();
	}
	
	@PostMapping
	public Role addRole (@RequestBody Role role) {
		return roleService.saveOrUpdateRole(role);
	}
	
	@PutMapping("/{idRole}")
	public boolean updateRole (@RequestBody Role role,@PathVariable long idRole) {
		role.setIdRole(idRole);
		roleService.saveOrUpdateRole(role);
		return true;
		
	}
	
	@DeleteMapping("/{idRole}")
	public boolean deleteRole (@PathVariable long idRole) {
		roleService.deleteRole(idRole);
		return true;
	}
	
	@GetMapping
	public List<Role> getAllRole(){
		return roleService.getAllRole();
	}
	
	@GetMapping("/{idRole}")
	public Role getRoleById (@PathVariable long idRole) {
		return roleService.getRoleById(idRole);
	}
	
}
