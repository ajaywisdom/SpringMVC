package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This HOme Controller");
		model.addAttribute("name", "Ajay Sharma");
		return "index";
	}
}
