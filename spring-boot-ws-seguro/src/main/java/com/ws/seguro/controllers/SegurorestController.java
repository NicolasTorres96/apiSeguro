package com.ws.seguro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ws.seguro.model.Seguro;
import com.ws.seguro.model.services.ISeguroService;

@RestController
@RequestMapping("/api")
public class SegurorestController {

	@Autowired
	private ISeguroService seguroService;
	
	@GetMapping("/seguro")
	public List<Seguro> index(){
		return seguroService.findAll();
	}
}
