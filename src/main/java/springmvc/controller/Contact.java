package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller	
@RequestMapping("/contact")
public class Contact {
	@RequestMapping("/show")
	public String show() {
		return "contact";
	}
	@RequestMapping(path="/create", method=RequestMethod.POST)
	public String create(@RequestParam("email") String email, @RequestParam("password") String pass) {
		System.out.println(email+" "+pass);
		return "null";
	}
}
