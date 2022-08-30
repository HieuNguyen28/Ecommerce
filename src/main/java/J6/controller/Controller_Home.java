package J6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller_Home {
	
	@GetMapping({""})
	public String home() {
		return "user/pages/home";
	}
	
	@GetMapping({"admin","admin/home/index"})
	public String admin() {
		return "redirect:/assets/admin/index.html";
	}

	@GetMapping("login")
	public String login(){
		return "user/security/login";
	}

	@GetMapping("blog")
	public String blog(){
		return "user/pages/blog";
	}

	@GetMapping("about")
	public String about(){
		return "user/pages/about";
	}

	@GetMapping("contact")
	public String contact(){
		return "user/pages/contact";
	}
}
