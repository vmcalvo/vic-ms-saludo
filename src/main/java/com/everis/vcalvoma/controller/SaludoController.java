package com.everis.vcalvoma.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.vcalvoma.domain.Saludo;

@RestController
public class SaludoController {
	
	protected Logger logger = Logger.getLogger(SaludoController.class
			.getName());
	
	private static final String template = " %s, ten un buen día!";
	
	
	@RequestMapping("/saludo/{name}")
    public Saludo saludo(@PathVariable("name") String name) {
        return new Saludo(String.format(template, name));
    }

}
