package controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.Module;
import service.ModuleService;

@Controller
@RequestMapping("/sysadmin/module/")
public class ModuleController extends BaseController{
	
	@Resource
	private ModuleService moduleService;
	
	@RequestMapping("list")
	public String toModuleList(Model model){
		//准备module数据
		List<Module> moduleList = moduleService.findModuleList();
		
		model.addAttribute("moduleList", moduleList);
		
		return "sysadmin/module/jModuleList";
	}
	
	@RequestMapping("start")
	public String toStart( @RequestParam("moduleId") String[] moduleIds){
		
		moduleService.updateState(moduleIds,1);
		return "redirect:/sysadmin/module/list";
	}
	
	@RequestMapping("stop")
	public String toStop( @RequestParam("moduleId") String[] moduleIds){
		
		moduleService.updateState(moduleIds,0);
		return "redirect:/sysadmin/module/list";
	}
	
	@RequestMapping("tocreate")
	public String toCreate(Model model){
		//为上级模块准备数据
		List<Module> list = moduleService.findModuleList();
		model.addAttribute("list", list);
		return "sysadmin/module/jModuleCreate";
	}
	
	@RequestMapping("saveModule")
	public String saveModule(Module module){
		
		moduleService.saveModule(module);
		return "redirect:/sysadmin/module/list";
	}
	
	@RequestMapping("delete")
	public String deleteModule(@RequestParam("moduleId") String[] moduleIds){
		
		moduleService.deleteModule(moduleIds);
		return "redirect:/sysadmin/module/list";
	}
	
	@RequestMapping("toupdate")
	public String toupdate(String moduleId,Model model){
		//准备修改数据
		Module module = moduleService.findModuleById(moduleId);
		
		//准备上级模块下拉列表
		List<Module> moduleList = moduleService.findModuleList();
		
		model.addAttribute("module",module);
		model.addAttribute("list", moduleList);
		
		//转向修改页面
		return "sysadmin/module/jModuleUpdate";
	}
	@RequestMapping("updateModule")
	public String updateModule(Module module){
		
		moduleService.updateModule(module);
		
		return "redirect:/sysadmin/module/list";
	}
	
	@RequestMapping("toview")
	public String toview(String moduleId,Model model){
		Module module = moduleService.findModuleById(moduleId);
		model.addAttribute("module", module);
		return "sysadmin/module/jModuleView";
	}
	
}
