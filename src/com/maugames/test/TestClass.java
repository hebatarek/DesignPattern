package com.maugames.test;


public class TestClass {

	public static void main(String[] args) {
		if(isEmailValid("suhaila.dehis@maugames.com"))
			System.out.println("email is valid");
		else
			System.out.println("email is invalid");

	}
	
	private static boolean isEmailValid(String email) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
		java.util.regex.Matcher m = p.matcher(email);
		if (!m.matches()) {
			return false;
		}
		return true;
	}

}
