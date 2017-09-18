package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresGuest;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.jdbc.StringUtils;

import pojo.User;
import service.UserService;

@Controller
public class LoginController extends BaseController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/validate/doLogin")
	public String doLogin(String username,String password,HttpSession session,HttpServletRequest req){
		
		if(StringUtils.isNullOrEmpty(username) || StringUtils.isNullOrEmpty(password)){	
			session.setAttribute("loginFailed",2);
			return "forward:/login.jsp";
		}
		
		//令牌
		UsernamePasswordToken token = new UsernamePasswordToken(username,password);
		//请求的对象
		Subject subject = SecurityUtils.getSubject();
		try {
			
			//调用shiro的登陆验证
			subject.login(token);
			//通过username查询出对象
			User user = userService.findUserByUserName(username);
			subject.getSession().setAttribute("user", user);
			return "back_index";
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("msg", "用户名或密码错误");
			return "forward:/login.jsp";
		}
		
	}
	
	/*@RequiresPermissions(value={"aaa"},logical=Logical.AND)*/
	/*@RequiresRoles(value={"普通用户"},logical=Logical.AND)*/
	@RequestMapping("/validate/labelTest")
	public String labelTest(){
		return "shiroLabel";
	}
	@RequestMapping("/validate/loginOut")
	public String loginOut(){
		//请求的对象
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "forward:/login.jsp";
	}
}
