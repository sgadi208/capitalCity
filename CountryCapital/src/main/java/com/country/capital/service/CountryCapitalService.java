package com.country.capital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.country.capital.dao.CountryCapitalDao;

@Service
public class CountryCapitalService {

	@Autowired
	CountryCapitalDao dao;

	public String getCountryCapital(String countryName) {
		String captialCity = null;
		try {
			captialCity = dao.getCountryCapital(countryName);
		} catch (Exception e) {
			throw e;
		}
		return captialCity;
	}

}
