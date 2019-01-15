package com.lz.snappy.echartsDemo.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lz.snappy.echartsDemo.demo.dao.PersonMapper;
import com.lz.snappy.echartsDemo.demo.model.Person;
import com.lz.snappy.echartsDemo.demo.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonMapper personMapper;

	@Override
	public Person getPerson(Integer id) {
		return personMapper.findWeightByPerson(id);
	}

}
