package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.User;
import pojo.UserInfo;

public interface UserMapper {
	public List<User> findUserList();

	public void updateState(@Param("id")String id, @Param("state")int i);

	public void deleteUsers(String[] userIds);
	
	public List<UserInfo> findManagerList();

	public void saveUser(User user);

	public void saveUserRole(@Param("userId") String userId, @Param("roleId")String roleId);

	public List<String> findRoleIdByUserId(String userId);

	public void deleteRoleByUserId(String userId);

	public User findUserByUserName(String username);
	
	public List<String> findModuleIdByUserId(String userId);
}
