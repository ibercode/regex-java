package com.ibercode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDigits {

	public String getDigits(String string) {
		
		StringBuilder sb = new StringBuilder();
		
		String regex = "[0-9]{3}";
		
		Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(string);
        
        while(m.find()) {
            sb.append(m.group());
            sb.append(", ");
        }
		
        if(sb.length()>2) {
        	return sb.toString().substring(0, sb.length()-2);
        }
        else {
        	return "";
        }
	}

}