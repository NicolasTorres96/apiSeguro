package com.ws.seguro.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ws.seguro.model.Seguro;

public interface ISeguroDao extends JpaRepository<Seguro, Long>{

	@Query("select s from Seguro s where s.tiposeguro = ?1")
	public List<Seguro> findByTiposeguro(String tipo);
}
