package com.ws.seguro.model.services;

import java.util.List;

import com.ws.seguro.model.Seguro;

public interface ISeguroService {

	public List<Seguro> findAll();
	public List<Seguro> findByTiposeguro(String tipo);
	
}
