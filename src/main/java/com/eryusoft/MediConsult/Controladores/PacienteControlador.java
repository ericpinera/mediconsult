package com.eryusoft.MediConsult.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteControlador 
{
	@GetMapping("/paciente")
	public String paciente() 
	{
		return "Paciente";
	}

}
