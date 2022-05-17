package com.country.capital.validator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.country.capital.CountryCapitalApplicationTests;

public class CountryNameValidatorTest extends CountryCapitalApplicationTests {

	@Autowired
	CountryNameValidator validate;

	@Test
	public void validateCountryNameSpecialCharacter() {
		boolean isValidCountryName = validate.validateCountryName("Italy#");
		assertTrue(!isValidCountryName);
	}

	@Test
	public void validateCountryNameNumber() {
		boolean isValidCountryName = validate.validateCountryName("Italy1");
		assertTrue(!isValidCountryName);
	}

	@Test
	public void validateCountryName() {
		boolean isValidCountryName = validate.validateCountryName("Italy1");
		assertTrue(isValidCountryName);
	}

}