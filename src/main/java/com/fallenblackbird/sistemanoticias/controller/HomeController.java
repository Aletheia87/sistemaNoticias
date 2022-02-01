package com.fallenblackbird.sistemanoticias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.fallenblackbird.sistemanoticias.service.LeerTxt;

@Controller
public class HomeController {

	
	LeerTxt txt = new LeerTxt();
	
	
	@RequestMapping(value="inicio", method=RequestMethod.GET)
	public String home(Model modelo) {
		modelo.addAttribute("noticia1", txt.leerArchivoTxt().get(0));
		modelo.addAttribute("noticia2",txt.leerArchivoTxt().get(1));
		modelo.addAttribute("noticia3",txt.leerArchivoTxt().get(2));
		modelo.addAttribute("noticia4",txt.leerArchivoTxt().get(3));
		modelo.addAttribute("noticia5",txt.leerArchivoTxt().get(4));
	
		return "inicio";
		
	}
}
