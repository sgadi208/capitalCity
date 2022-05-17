package com.country.capital.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class CountryNameValidator {

	public boolean validateCountryName(String countryName) {
		Pattern pattern = Pattern.compile("[^a-zA-Z]");
		Pattern number = Pattern.compile("[0-9]");
		Pattern whiteSpace = Pattern.compile("\\s");
		Matcher matcher = pattern.matcher(countryName);
		Matcher matchNumber = number.matcher(countryName);
		Matcher matchwhiteSpace = whiteSpace.matcher(countryName);
		boolean isStringContainsSpecialCharacter = matcher.find();
		boolean isStringContainsNumber = matchNumber.find();
		boolean isStringContainWhiteSpace = matchwhiteSpace.find();
		if ((isStringContainsSpecialCharacter || isStringContainsNumber) && !isStringContainWhiteSpace)
			return false;
		else
			return true;
	}

}
