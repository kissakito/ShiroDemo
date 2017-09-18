package service;

import java.util.List;
import java.util.UUID;

import pojo.Module;

public interface ModuleService {

public List<Module> findModuleList();

	public void updateState(String[] moduleIds, int i);
	
	public void saveModule(Module module);
	
	public void deleteModule(String[] moduleIds);

	public Module findModuleById(String moduleId);

	public void updateModule(Module module);

}
