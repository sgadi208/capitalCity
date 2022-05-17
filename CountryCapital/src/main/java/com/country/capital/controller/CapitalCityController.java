package com.country.capital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.country.capital.service.CountryCapitalService;
import com.country.capital.validator.CountryNameValidator;

@RestController
public class CapitalCityController {
	
	@Autowired
	CountryNameValidator validator;
	
	@Autowired
	CountryCapitalService service;
	
	@GetMapping(path="/CountryCapital/{countryName}")
	public ResponseEntity<String> getCountryCapital(@PathVariable("countryName") String countryName) {
		if(!validator.validateCountryName(countryName)) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Pease enter a valid CountryName");
		}
		String cityCapital = service.getCountryCapital(countryName);
		return ResponseEntity.status(HttpStatus.OK).body(cityCapital);
	}

}
