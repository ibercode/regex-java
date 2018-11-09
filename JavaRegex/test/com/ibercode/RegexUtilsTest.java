package com.ibercode;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegexUtilsTest {

	private static RegexUtils regexUtils;
	
	@BeforeEach
	public  void setup() {
		regexUtils = new RegexUtils();
	}
	
	@Test
	void testRegexFinder() {

		assertEquals(1, regexUtils.regexTest("\\w[a-zA-Z0-9-_]+\\.xml", "file_na-_me23.xml"));
	}
}
