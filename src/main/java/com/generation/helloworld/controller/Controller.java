package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {


	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Orientação ao Futuro <br/>"
				+ "Reponsabilidade Pessoal<br/>"
				+ "Mentalidade de Crescimento<br/>"
				+ "Persistência<br/>"
				+ "Trabalho em Equipe<br/>"
				+ "Atenção aos Detalhes<br/>"
				+ "Proatividade<br/>"
				+ "Comunicação<br/>";
	}
	
	@GetMapping("/obj")
	public String obj() {
		return "Meu objetivo é aprender e dominar completamente o framework Spring para construir aplicações fantásticas e ser um ótimo profissional\nAprender a trabalhar em grupo para desenvolver o projeto integrador\nAprender a trabalhar em equipe usando o Github\nAprender a usar o docker que vamos aprender";
	}
	
}
