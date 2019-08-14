package com.eryusoft.MediConsult.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eryusoft.MediConsult.Model.Paciente;

@Controller
@RequestMapping("/paciente")
public class PacienteControlador 
{
	@GetMapping(path = {"","/"})
	public String paciente() 
	{
		return "Paciente";
	}
	
	@RequestMapping(value="/registrarPaciente", method = {RequestMethod.POST})
	public String registrarPaciente(Paciente paciente) 
	{
		System.out.println(paciente.getNombresApellidos());
		return "Paciente";
	}

}
