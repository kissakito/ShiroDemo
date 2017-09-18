package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pojo.Role;

public interface RoleMapper {
	
	@Select(value="select * from role_p")
	public List<Role> findRoleList();
	
	public void saveRole(Role role);
	
	public void deleteRoles(String[] ids);
	
	@Select("select * from role_p where role_id = #{roleId}")
	public Role findRoleById(String roleId);

	public void updateRole(Role role);

	public void saveRoleModule(@Param ("roleId")String roleId, @Param("moduleId")String moduleId);

	public List<String> findModuleIdByRoleId(String roleId);

	public void deleteRoleModule(String roleId);
	
}
