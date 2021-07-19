package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringCalculatorTest {

	@ParameterizedTest
	@CsvSource({"2 + 3 * 4 / 2, 10"})
	@DisplayName("문자열 계산기 테스트")
	void StringCalculator() {
		
	}

}
