package com.mx.nutricalc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VistasController {

	@GetMapping("/home/tables")
	public String getTablero(Model model) {
	System.out.println("paso controller visatas tables");
	model.addAttribute("user", "");
	return "pages/tables/basic-table";
	}
	
	
	@GetMapping("/home/forms")
	public String getForms(Model model) {
	System.out.println("paso controller visatas forms");
	model.addAttribute("user", "");
	return "pages/forms/basic_elements";
	}
	
	@GetMapping("/home/charts")
	public String getSharts(Model model) {
	System.out.println("paso controller visatas charts");
	model.addAttribute("user", "");
	return "pages/charts/chartjs";
	}
	
	@GetMapping("/home/icons")
	public String getIcons(Model model) {
	System.out.println("paso controller visatas icons");
	model.addAttribute("user", "");
	return "pages/icons/mdi";
	}
}
