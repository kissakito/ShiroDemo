package controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Dept;
import pojo.Role;
import pojo.User;
import pojo.UserInfo;
import service.UserService;
@Controller
@RequestMapping("/sysadmin/user/")
public class UserController extends BaseController{
	@Resource
	private UserService userService;
	
	@RequestMapping("list")
	public String toUserList(Model model){
		List<User> userList = userService.findUserList();
		model.addAttribute("userList", userList);
		
		return "sysadmin/user/jUserList";
	}
	
	//改变状态 启用
	@RequestMapping("start")
	public String toStart(@RequestParam(value="userId") String[] userIds){
		userService.updateState(userIds,1);
		return "redirect:/sysadmin/user/list";
	}
	
	//改变状态 停用
	@RequestMapping("stop")
	public String toStop(@RequestParam(value="userId") String[] userIds){
		
		userService.updateState(userIds,0);
		return "redirect:/sysadmin/user/list";
	}
	
	@RequestMapping("delete")
	public String toDelete( @RequestParam(value="userId") String[] userIds){
		
		userService.deleteUsers(userIds);
		return "redirect:/sysadmin/user/list";
	}
	
	@RequestMapping("tocreate")
	public String toCreate(Model model){
		//准备部门下拉列表
		List<Dept> deptList = userService.findDeptList();
		List<UserInfo> managerList =  userService.findManagerList();
		model.addAttribute("deptList", deptList);
		model.addAttribute("managerList", managerList);
		
		return "sysadmin/user/jUserCreate";
	}
	
	@RequestMapping("saveUser")
	public String saveUser(User user){
		
		userService.saveUser(user);
		return "redirect:/sysadmin/user/list";
	}
	
	//转向角色页面
	@RequestMapping("toUserRole")
	public String toUserRole(String userId,Model model) throws JsonProcessingException{
		//准备的角色信息
		List<Role> roleList = userService.findRoleList();
		
		//根据userId 查询当前用户的角色
		List<String> userRoleList = userService.findRoleByUserId(userId);
		for (Role role : roleList) {
			if(userRoleList.contains(role.getRoleId())){
				role.setChecked("true");
			}
		}
		
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(roleList);
		model.addAttribute("json", json);
		model.addAttribute("userId", userId);
		//转向角色页面
		return "sysadmin/user/jUserRole";
	}
	
	@RequestMapping("saveUserRole")
	public String saveUserRole(String userId,String[] roleIds){
		
		//userId 和roleId 都有可以正确插入
		userService.saveUserRole(userId,roleIds);
		
		return "redirect:/sysadmin/user/list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
