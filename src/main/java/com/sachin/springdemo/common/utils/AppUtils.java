/**
 * 
 */
package com.sachin.springdemo.common.utils;

/**
 * @author Dheeraj
 *
 */
public class AppUtils {

	public static String generateFixedLengthRandomNumber(long length) {
		if (length > 18) {
			throw new IllegalStateException("To many digits");
		}
		long tLen = (long) Math.pow(10, length - 1) * 9;
		long number = (long) (Math.random() * tLen) + (long) Math.pow(10, length - 1) * 1;

		String randomNumber = number + "";
		if (randomNumber.length() != length) {
			throw new IllegalStateException("The random number '" + randomNumber + "' is not '" + length + "' digits");
		}
		return randomNumber;
	}

	/**
	 * Whether given value is blank or not.
	 */
	public static boolean isBlank(String str) {
		int strLen;
		if (str == null || (strLen = str.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNotBlank(String str) {
		return !isBlank(str);
	}
}
