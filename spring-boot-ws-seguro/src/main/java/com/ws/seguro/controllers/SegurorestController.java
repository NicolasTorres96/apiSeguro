package com.ws.seguro.controllers;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ws.seguro.model.Seguro;
import com.ws.seguro.model.services.ISeguroService;

@RestController
@RequestMapping("/api")
public class SeguroRestController {

	@Autowired
	private ISeguroService seguroService;
	
	@GetMapping("/seguro")
	public List<Seguro> index(){
		return seguroService.findAll();
	}
	
	@GetMapping("/seguro/{tipo}")
	public List<Seguro> index_tipo(@PathVariable String tipo){
		return seguroService.findByTiposeguro(tipo);
		/*List<Seguro> seguros = seguroService.findAll();
		List<Seguro> segurosFiltrados = new ArrayList<Seguro>();
		for (Seguro seguro : seguros) {
			if (seguro.getTiposeguro()== tipo) {
				segurosFiltrados.add(seguro);
			}
		}
		return segurosFiltrados;*/
	}
}
