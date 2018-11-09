package com.ibercode;

public class App {

	private static RegexUtils regexUtils = new RegexUtils();
	
	public static void main(String[] args) {

		String regex = "\\w[a-zA-Z0-9-_]+\\.xml";
		String text = "file_na-_me23.xml";
		
		int matches = regexUtils.regexTest(regex, text);
		
		System.out.println("Matches " + matches);
		
	}
}
