package com.ws.seguro.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ws.seguro.model.Seguro;
import com.ws.seguro.model.dao.ISeguroDao;

@Service
public class SeguroServiceImpl implements ISeguroService{

	@Autowired
	private ISeguroDao seguroDao;
	@Override
	@Transactional(readOnly=true)
	public List<Seguro> findAll() {
		 
		return (List<Seguro>) seguroDao.findAll();
	}

}
