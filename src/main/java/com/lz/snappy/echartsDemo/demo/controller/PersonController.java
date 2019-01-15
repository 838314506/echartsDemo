package com.lz.snappy.echartsDemo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lz.snappy.echartsDemo.demo.model.Person;
import com.lz.snappy.echartsDemo.demo.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/myWeight")
	public Person getPerson(Integer id) {
		return personService.getPerson(id);
	}
	
	@GetMapping("/toPerson")
	public String toPerson() {
		return "person/person";
	}

	@GetMapping("/index")
	public String index() {
		return "index";
	}
}
