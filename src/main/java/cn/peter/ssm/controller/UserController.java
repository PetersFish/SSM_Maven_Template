package cn.peter.ssm.controller;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.peter.ssm.pojo.User;
import cn.peter.ssm.service.IUserService;
import cn.peter.ssm.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private User user;

	@RequestMapping(value="/tologin")
	public String tologin() {
		System.out.println("==============");
		return "login";
	}
	
	@RequestMapping(value="/checkifo")
	public String checkIfo(Model model,HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		user.setUsername(username);
		user.setPassword(password);
		boolean flag = userService.checkIfo(user);
		if(flag) {
			//登录成功，跳转success页面，将信息带过去
			model.addAttribute("name", user.getUsername());
			return "success";
		}
		else {
			//登录失败，重定向到login页面，返回失败信息
			model.addAttribute("msg", "用户名或密码错误");
			return "redirect:/user/tologin";
		}
		
	}
}
