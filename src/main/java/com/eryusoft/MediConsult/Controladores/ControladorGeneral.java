package com.eryusoft.MediConsult.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorGeneral {
	
	@GetMapping(path= {"/"})
	public String saludar() { 
		return "index";
		}

}
