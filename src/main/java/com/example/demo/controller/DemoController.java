package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Persona;

/*Inicializar servicio */
//D:\Users\marcn\Documents\Java\demo\target => java -jar demo-0.0.1-SNAPSHOT.jar

@RestController
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping(value="/persona", method = RequestMethod.GET)
	public Persona obtenerPersona(HttpServletRequest request) {
		Persona person = new Persona();
		person.setNombre("Hola");
		person.setApellidos("Mundo");
		person.setEdad("18");
		person.setCorreo("01234");
		
		return person;
	}
	
	@RequestMapping(value="/persona2", method = RequestMethod.GET)
	public Persona obtenerPersona2(HttpServletRequest request) {
		Persona person = new Persona();
		person.setNombre("Raul");
		person.setApellidos("Hernandez");
		person.setEdad("20");
		person.setCorreo("01234");
		
		return person;
	}
}
