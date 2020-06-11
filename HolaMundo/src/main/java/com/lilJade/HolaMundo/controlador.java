package com.lilJade.HolaMundo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lilJade.model.Persona;

@Controller
public class controlador {

	@GetMapping("/")
	public String Inicio(Model modelo) {
		Persona p = new Persona();
		p.setNombre("Lil");
		p.setApellido("Jade");
		p.setTelefono("0000-0000");
		p.setEmail("correo1@gmail.com");
		
		Persona p2 = new Persona();
		p2.setNombre("Anto");
		p2.setApellido("D.");
		p2.setTelefono("0000-0000");
		p2.setEmail("correo2@gmail.com");
		
		List personas = Arrays.asList(p, p2);
		
		String msj = "Hola desde el controlador";
		modelo.addAttribute("saludo", msj);
		modelo.addAttribute("persona", personas);
		return "index";
	}
	
}