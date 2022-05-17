package com.country.capital.service;

import com.country.capital.CountryCapitalApplicationTests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CountryCapitalServiceTest extends CountryCapitalApplicationTests {

	@Autowired
	CountryCapitalService service;

	@Test
	public void validCountryNameTest() {
		String name = service.getCountryCapital("Italy");
		assertEquals("Rome", name);
	}

	@Test
	public void validCountryNameInvalidNameTest() {
		String expected = "No Capital city found for the given Country : Italyyyy";
		String name = service.getCountryCapital("Italyyyy");
		assertEquals(expected, name);
	}

}