package br.com.ghlabs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/ola")
	public String hello() 
	{
		return "olamundo";
	}
}
