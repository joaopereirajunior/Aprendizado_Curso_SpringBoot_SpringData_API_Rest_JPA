package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OlaController {
@RequestMapping(value = "/ola")
@ResponseBody
	public String ola(){
		
		return "Olá Spring Boot";
	}
}
