package com.country.capital.dao;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

@Service
public class CountryCapitalDao {

	Map<String, String> countriesMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

	public CountryCapitalDao() {
		countriesMap.put("Italy", "Rome");
		countriesMap.put("England", "London");
		countriesMap.put("Japan", "Tokyo");
	}

	public String getCountryCapital(String countryName) {
		String capitalCity = null;
		try {
			if (countriesMap.containsKey(countryName)) {
				capitalCity = countriesMap.get(countryName);
			} else {
				capitalCity = "No Capital city found for the given Country : " + countryName;
			}
		} catch (Exception e) {
			throw e;
		}
		return capitalCity;
	}

}
