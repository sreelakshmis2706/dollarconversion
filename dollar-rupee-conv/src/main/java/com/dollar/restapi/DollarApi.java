package com.dollar.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dollar.service.Dollarservice;


@RestController
public class DollarApi {

	@Autowired
	Dollarservice obj;
	
	@PostMapping ("/input")
	public ResponseEntity<?> readvalue(@RequestBody Integer dol)
	{
		return ResponseEntity.ok(obj.read(dol));
		
	}
	
}
