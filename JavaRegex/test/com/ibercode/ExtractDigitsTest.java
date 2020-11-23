package com.ibercode;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ExtractDigitsTest {

	ExtractDigits ed;
	
	@BeforeEach
	void setUp() {
		ed = new ExtractDigits();
	}
	
	@ParameterizedTest
	@CsvSource({
		"abc 12,''",
		"cdefg 345 12bb23, 345",
		"cdefg 345 12bbb33 678tt, '345, 678'"
	})
	void testExtractDigits(String input, String output) {

		assertThat(ed.getDigits(input))
			.isEqualTo(output);
	}

}