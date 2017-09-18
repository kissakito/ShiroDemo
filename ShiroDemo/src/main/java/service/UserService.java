package service;

import java.util.List;

import pojo.Dept;
import pojo.Role;
import pojo.User;
import pojo.UserInfo;

public interface UserService {
	
	public List<User> findUserList();
	
	public void updateState(String[] userIds, int i);
	
	public void deleteUsers(String[] userIds);

	public List<Dept> findDeptList();
	//查询上级领导
	public List<UserInfo> findManagerList();

	public void saveUser(User user);

	public List<Role> findRoleList();

	public void saveUserRole(String userId, String[] roleIds);

	public List<String> findRoleByUserId(String userId);

	public List<String> findModuleIdByUserId(String userId);

	public User findUserByUserName(String username);
}
