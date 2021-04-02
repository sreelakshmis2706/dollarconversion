package com.dollar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dollar.entity.Dollar;

@Repository
public class Dollarservice {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public Dollar read(int dol)
	{
		String sql = "select * from Dollar where dollar = ? ";
		RowMapper<Dollar> rowmapper = new BeanPropertyRowMapper<Dollar>(Dollar.class);
		Dollar result = jdbctemplate.queryForObject(sql,new Object[] {dol} ,rowmapper); //since its only a sinlge object use queryforobject
		return result;
		
	}

}
