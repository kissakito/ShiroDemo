package service;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mapper.DeptMapper;
import mapper.RoleMapper;
import mapper.UserInfoMapper;
import mapper.UserMapper;
import pojo.Dept;
import pojo.Role;
import pojo.User;
import pojo.UserInfo;
import utils.MD5Hash;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	
	@Resource
	private DeptMapper deptMapper;
	
	@Resource
	private UserInfoMapper userInfoMapper;
	
	@Resource
	private RoleMapper roleMapper;
	@Override
	public List<User> findUserList() {
		
		return userMapper.findUserList();
	}


	@Override
	public void updateState(String[] userIds, int i) {
		for (String id : userIds) {
			
			userMapper.updateState(id,i);
		}
		
	}


	//删除多个用户
	public void deleteUsers(String[] userIds) {
		
		userMapper.deleteUsers(userIds);
		userInfoMapper.deleteUserInfo(userIds);
		
	}


	public List<Dept> findDeptList() {
		return deptMapper.findDeptList();
	}


	@Override
	public List<UserInfo> findManagerList() {
		
		return userMapper.findManagerList();
	}


	@Override
	public void saveUser(User user) {
		//保存用户信息---user_p
		String uuid = UUID.randomUUID().toString();
		user.setUserId(uuid);
		
		UserInfo userInfo = user.getUserInfo();
		userInfo.setUserInfoId(uuid);
		
		//用户密码加密
		String password = user.getPassword();
		String username = user.getUsername();
		String md5Password = MD5Hash.getMd5Hash(password, username);
		user.setPassword(md5Password);
		userMapper.saveUser(user);
		userInfoMapper.saveUserInfo(userInfo);
		
		
		
	}


	@Override
	public List<Role> findRoleList() {
		
		return roleMapper.findRoleList();
	}


	@Override
	public void saveUserRole(String userId, String[] roleIds) {
		//用户分配的角色应该就是最终的角色，应该把之前的角色信息删除
		/**
			步骤
			根据用户的ID查询角色信息 如果角色信息存在则删除
			如果该用户没有分配角色则 直接添加
		**/
		List<String> roleList = userMapper.findRoleIdByUserId(userId);
		if(!roleList.isEmpty()){
			userMapper.deleteRoleByUserId(userId);
		}
		for (String roleId : roleIds) {
			userMapper.saveUserRole(userId,roleId);
		}
		
		
	}


	@Override
	public List<String> findRoleByUserId(String userId) {
		
		return userMapper.findRoleIdByUserId(userId);
	}


	//根据用户名查询用户
	public User findUserByUserName(String username) {
		
		
		return userMapper.findUserByUserName(username);
	}


	@Override
	public List<String> findModuleIdByUserId(String userId) {
		return userMapper.findModuleIdByUserId(userId);
	}

}
