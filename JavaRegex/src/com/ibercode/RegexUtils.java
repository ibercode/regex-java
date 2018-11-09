package com.ibercode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {

	public int regexTest(String regex, String text) {
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		int matches = 0;
		while (matcher.find()) {
			matches++;
		}

		return matches;
	}
}
