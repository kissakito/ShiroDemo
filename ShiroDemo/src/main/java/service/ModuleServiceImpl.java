package service;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mapper.ModuleMapper;
import pojo.Module;

@Service
public class ModuleServiceImpl implements ModuleService{
	
	@Resource
	private ModuleMapper moduleMapper;
	
	public List<Module> findModuleList() {
		
		return moduleMapper.findModuleList();
	}

	public void updateState(String[] moduleIds, int i) {
		for (String id : moduleIds) {
			moduleMapper.updateState(id,i);
		}
	}
	
	public void saveModule(Module module) {
		String uuid = UUID.randomUUID().toString();
		module.setModuleId(uuid);
		moduleMapper.saveModule(module);
	}
	
	public void deleteModule(String[] moduleIds) {
		
		moduleMapper.deleteModule(moduleIds);
		
	}

	public Module findModuleById(String moduleId) {
	
		return moduleMapper.findModuleById(moduleId);
	}

	public void updateModule(Module module) {
		
		moduleMapper.updateModule(module);
	}
	
}
