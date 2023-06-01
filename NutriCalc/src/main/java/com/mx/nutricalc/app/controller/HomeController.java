package com.mx.nutricalc.app.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController
@Controller
//@RequestMapping("/nutricalc")
public class HomeController {

	@GetMapping({"/","/index","login"})
	public String login(Model model) {
		return "login";
	}
	
	@PostMapping({"/home"})
	public String home(Model model, String userName,@RequestParam String password) {
		System.out.println("User: " + userName);
		System.out.println("Pass: " + password);
		model.addAttribute("user", userName);
		return "home";
	}
}
