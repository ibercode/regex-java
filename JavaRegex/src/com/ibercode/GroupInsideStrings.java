package com.ibercode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupInsideStrings {

	public static void main(String[] args) {
		
		String line = "<script>window.location = 'http://www.ibercode.com</script>";
		
		Pattern pattern = Pattern.compile("(<script>)(.*)(</script>)");
		Matcher matcher = pattern.matcher(line);
		while (matcher.find()) {
		    System.out.println("group 1: " + matcher.group(1));
		    System.out.println("group 2: " + matcher.group(2));
		    System.out.println("group 3: " + matcher.group(3));
		}
		
	}
}
