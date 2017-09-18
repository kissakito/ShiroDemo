package controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Module;
import pojo.Role;
import service.RoleService;

@Controller
@RequestMapping("/sysadmin/role/")
public class RoleController extends BaseController{
	
	@Resource
	private RoleService roleService;
	
	//转向角色列表
	@RequestMapping("list")
	public String toRoleList(Model model){
		//准备角色数据
		List<Role> roleList = roleService.findRoleList();
		model.addAttribute("roleList", roleList);
		
		return "sysadmin/role/jRoleList";
	}
	
	
	@RequestMapping("tocreate")
	public String tocreate(){
		return "sysadmin/role/jRoleCreate";
	}
	
	@RequestMapping("save")
	public String saveRole(Role role){
		
		roleService.saveRole(role);
		return "redirect:/sysadmin/role/list";
	}
	
	@RequestMapping("delete")
	public String deleteRole(@RequestParam("roleId") String[] ids){
		
		roleService.deleteRoles(ids);
		
		return "redirect:/sysadmin/role/list";
	}
	
	@RequestMapping("toupdate")
	public String toUpdate(String roleId,Model model){
		//准备要修改的数据
		Role role = roleService.findRoleById(roleId);
		model.addAttribute("role", role);
		return "sysadmin/role/jRoleUpdate";
	}
	
	@RequestMapping("update")
	public String updateRole(Role role){
		roleService.updateRole(role);
		
		return "redirect:/sysadmin/role/list";
	}
	
	@RequestMapping("toview")
	public String toview(String roleId,Model model){
		//准备要查看的数据
		Role role = roleService.findRoleById(roleId);
		model.addAttribute("role", role);
		
		return "sysadmin/role/jRoleView";
	}
	
	@RequestMapping("toRoleModule")
	public String toRoleModule(String roleId,Model model) throws JsonProcessingException{
		//为转向权限页面准备数据  所有的权限列表
		List<Module> moduleList = roleService.findModuleList();
		
		//查询当前角色所拥有的权限
		List<String> moduleIdList = roleService.findModuleIdByRoleId(roleId);
		
		for (Module module : moduleList) {
			if(moduleIdList.contains(module.getModuleId())){
				module.setChecked("true");
			}
		}
		
		
		
		//将moduleList转化为json串 zTree树才能正确显示    必须要有  id  name pId  checked 
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(moduleList);
		System.out.println(json);
		model.addAttribute("json", json);
		model.addAttribute("roleId", roleId);
		return "sysadmin/role/jRoleModule";
	}
	
	@RequestMapping("saveRoleModule")
	public String saveRoleModule(String roleId,String[] moduleIds){
		
		//角色和权限保存
		roleService.saveRoleModule(roleId,moduleIds);
		
		return "redirect:/sysadmin/role/list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
