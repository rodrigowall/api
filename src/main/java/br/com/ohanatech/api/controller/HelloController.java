package br.com.ohanatech.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}

	@RequestMapping("/fechado")
	@ResponseBody
	public String helloFechado() {
		return "Hello World area fechada!";
	}
}
