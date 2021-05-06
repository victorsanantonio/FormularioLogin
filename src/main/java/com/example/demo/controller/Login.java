package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Usuario;

@Controller
@RequestMapping("")
public class Login {
	
	@GetMapping("/login")
	public String saludo(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario );
		return "login";
	}
	
	@PostMapping("/saludo")
	public String loginQuery(Model model, @ModelAttribute("usuario") Usuario usuario) {
		model.addAttribute("usuario", usuario);
		return "saludo";
	}
}
