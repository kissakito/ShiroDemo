package service;

import java.util.List;

import pojo.Module;
import pojo.Role;

public interface RoleService {

	public List<Role> findRoleList();

	public void saveRole(Role role);
	
	public void deleteRoles(String[] ids);

	public Role findRoleById(String roleId);

	public void updateRole(Role role);

	public List<Module> findModuleList();

	public void saveRoleModule(String roleId, String[] moduleIds);

	public List<String> findModuleIdByRoleId(String roleId);
	
}
