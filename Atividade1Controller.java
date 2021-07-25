package com.SpringBoot.Atividade1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class Atividade1Controller {
	
	@GetMapping
	public String ola() {
		return "\t\t\tOlá Mundo.\nPara executar meu primeiro projeto com SpringBoot"
				+ "\tprecisei ter muita comunicação com meus colegas, além de orientação"
				+ "\tao detalhe, para que o mesmo pudesse funcionar. A persistência foi uma mentalidade"
				+ "\tessencial, pois foram diversos erros até chegar ao funcionamento.";
	}


}
