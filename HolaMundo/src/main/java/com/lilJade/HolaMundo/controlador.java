package com.lilJade.HolaMundo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controlador {

	@GetMapping("/")
	public String Inicio(Model modelo) {
		String msj = "Hola desde el controlador";
		modelo.addAttribute("saludo", msj);
		return "index";
	}
	
}
//Comment