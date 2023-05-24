package com.mx.nutricalc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
//@RequestMapping("/nutricalc")
public class HomeController {

	@GetMapping({"/","/home","/index","login"})
	public String home(Model model) {
		return "login";
	}
}
