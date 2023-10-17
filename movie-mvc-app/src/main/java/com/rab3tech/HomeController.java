package com.rab3tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//This is my model class
@Controller
public class HomeController {
	
	@Autowired
	private LoginDao loginDao;
	
	@GetMapping("/")
	//This method resolves index.jsp
	public String foo() {
		
		return "index";
		
	}
	
	@GetMapping("/login")
	public String loginPage() {
		
		return "clogin"; 
		
	}
	
	@PostMapping("/login")
	public String loginSubmit(@RequestParam String username, @RequestParam String password, Model model) {
		
		if(loginDao.validateUser(username, password)) {
			return "home";
		}
		else {
			//pagescope, reqscope, session scope, app scope
			
			model.addAttribute("message", "do not match");
			return "clogin";
			
		}

	}
	
}
