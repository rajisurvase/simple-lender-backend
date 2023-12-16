package com.sachin.springdemo.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dheeraj
 *
 */
public class PasswordValidatorUtils {

	private static Pattern lowerletter = Pattern.compile("[a-z]");
	private static Pattern upperletter = Pattern.compile("[A-Z]");
	private static Pattern digit = Pattern.compile("[0-9]");
	private static Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
	private static Pattern eight = Pattern.compile(".{8}");

	public static String validatePassword(String password) {
		Matcher hasLowerLetter = lowerletter.matcher(password);
		Matcher hasUpperLetter = upperletter.matcher(password);
		Matcher hasDigit = digit.matcher(password);
		Matcher hasSpecial = special.matcher(password);
		Matcher hasEight = eight.matcher(password);

		if (!hasLowerLetter.find()) {
			return "Password must contain atleast one lower case character.";
		}

		if (!hasUpperLetter.find()) {
			return "Password must contain atleast one upper case character.";
		}

		if (!hasDigit.find()) {
			return "Password must contain atleast one numeric value.";
		}

		if (!hasSpecial.find()) {
			return "Password must contain atleast one special character.";
		}

		if (!hasEight.find()) {
			return "Password must contain minimum eight characters.";
		}

		return "success";
	}

}
