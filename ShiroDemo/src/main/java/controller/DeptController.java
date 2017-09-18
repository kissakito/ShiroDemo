package controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.Dept;
import service.DeptService;

@Controller
@RequestMapping("/sysadmin/dept/")
public class DeptController extends BaseController{
	
	@Resource
	private DeptService deptService;
	
	@RequestMapping("list")
	public String toDeptList(Model model){
		//为页面准备数据
		List<Dept> deptList = deptService.findDeptList();
		model.addAttribute("deptList", deptList);
		return "sysadmin/dept/jDeptList";
	}
	
	//实现停用
	@RequestMapping("stop")
	public String toStop(@RequestParam(value="deptId") Integer[] deptIds){
		
		deptService.updateState(deptIds,0);
		return "redirect:/sysadmin/dept/list";
	}
	
	//实现启用
	@RequestMapping("start")
	public String toStart(@RequestParam(value="deptId") Integer[] deptIds){
		deptService.updateState(deptIds,1);
		return "redirect:/sysadmin/dept/list";
	}
	
	@RequestMapping("delete")
	public String toDeleteDept(@RequestParam(value="deptId") String[] deptIds){
		deptService.deleteDepts(deptIds);
		
		return "redirect:/sysadmin/dept/list";
	}
	
	@RequestMapping("tocreate")
	public String tocreate(Model model){
		//查询当前的所有部门 作为父级部门为下拉列表准备数据
		List<Dept> deptList = deptService.findDeptList();
		model.addAttribute("deptList", deptList);
		
		return "sysadmin/dept/jCreateDept";
	}
	
	
	@RequestMapping("saveDept")
	public String saveDept(Dept dept){
		//保存部门信息
		deptService.saveDept(dept);
		return "redirect:/sysadmin/dept/list";
	}
	
	//查看页面
	@RequestMapping("toview")
	public String toview(String deptId,Model model){
		//准备数据
		Dept dept = deptService.findDeptOne(deptId);
		model.addAttribute("dept", dept);
		//转向查看页面
		return "sysadmin/dept/jViewDept";
	}
	
	
	//转向修改页面
	@RequestMapping("toupdate")
	public String toupdate(String deptId,Model model){
		//准备要修改的数据
		Dept dept = deptService.findDeptOne(deptId);
		
		//准备部门下拉列表
		List<Dept> deptList = deptService.getDeptList();
		
		model.addAttribute("dept", dept);
		model.addAttribute("deptList", deptList);
		
		return "sysadmin/dept/jUpdateDept";
	}
	
	@RequestMapping("updateDept")
	public String updateDept(Dept dept){
		//部门的更新
		deptService.updateDept(dept);
		
		return "redirect:/sysadmin/dept/list";
	}
	
	
	
	
	
}
 