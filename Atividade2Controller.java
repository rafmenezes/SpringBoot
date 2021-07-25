package com.SpringBoot1.Atividade2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")

public class Atividade2Controller {
	
	@GetMapping
	public String objetivo() {
		return "Meus objetivos para a semana consistem em fazer melhor gestão de tempo, para que eu consiga"
				+ "/tentregar as atividades no momento assíncrono e não ficar muito tempo no PC após"
				+ "/o Bootcamp. Também traballhar a habilidade de proatividade, procurando alternativas para"
				+ "/tmelhor entendimento em videos e documentações!";
		
	}

}
