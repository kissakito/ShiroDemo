package service;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mapper.ModuleMapper;
import mapper.RoleMapper;
import pojo.Module;
import pojo.Role;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Resource
	private RoleMapper roleMapper;
	
	@Resource
	private ModuleMapper moduleMapper;
	
	//查询角色列表
	public List<Role> findRoleList() {
		
		return roleMapper.findRoleList();
	}

	@Override
	public void saveRole(Role role) {
		String uuid = UUID.randomUUID().toString();
		role.setRoleId(uuid);
		roleMapper.saveRole(role);
	}

	@Override
	public void deleteRoles(String[] ids) {
		
		roleMapper.deleteRoles(ids);
		
	}

	@Override
	public Role findRoleById(String roleId) {
		
		return roleMapper.findRoleById(roleId);
	}

	@Override
	public void updateRole(Role role) {
		
		roleMapper.updateRole(role);
		
	}

	//查询权限列表
	public List<Module> findModuleList() {
		List<Module> moduleList = moduleMapper.findModuleListState();
		for (Module module : moduleList) {
			if(module.getParentModule() !=null){
				String moduleId = module.getParentModule().getModuleId();
				module.setpId(moduleId);
			}
		}
		return moduleList;
	}
	
	
	
	
	@Override
	public void saveRoleModule(String roleId, String[] moduleIds) {
		
		//不管有没有数据先根据角色ID删除中间表数据
		roleMapper.deleteRoleModule(roleId);
		
		for (String moduleId : moduleIds) {
			roleMapper.saveRoleModule(roleId,moduleId);
		}	
		
	}

	@Override
	public List<String> findModuleIdByRoleId(String roleId) {
		
		return roleMapper.findModuleIdByRoleId(roleId);
	}

}
