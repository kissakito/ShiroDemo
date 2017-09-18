package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import pojo.Module;

public interface ModuleMapper {
	
	public List<Module> findModuleList();
	
	@Update("update module_p set state = #{state} where module_id = #{id}")
	public void updateState(@Param(value="id")String id, @Param(value="state")int i);
	
	public void saveModule(Module module);
	
	public void deleteModule(String[] moduleIds);

	public Module findModuleById(String moduleId);

	public void updateModule(Module module);
	
	public List<Module> findModuleListState();
}
