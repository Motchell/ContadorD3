package com.codingdojo.counter.cotrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	
	@GetMapping("")
	public String index(HttpSession session) {
		Integer contador = (Integer) session.getAttribute("contadorVisitas");
		
		if(contador == null) {
			contador = 0;
		}
		
		contador++;
		
		session.setAttribute("contadorVisitas", contador);
		
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String counter(HttpSession session) {
		return "counter.jsp";
	}
}
