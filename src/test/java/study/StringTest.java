package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
	@Test
	@DisplayName("replace() 알파벳 대체 테스트")
	void replace() {
		String actual = "abc".replace("b", "d");

		assertThat(actual).isEqualTo("adc");
	}

	@Test
	@DisplayName("split() 숫자 분리 테스트")
	void splitNumbers() {
		String[] actual = "1,2".split(",");

		assertThat(actual).contains("1");
		assertThat(actual).contains("2");
		assertThat(actual).containsExactly("1", "2");
	}

	@Test
	@DisplayName("substring()으로 괄호 제거 테스트")
	void substring() {
		String actual = substringBracket("(1,2)");

		assertThat(actual).isEqualTo("1,2");
	}

	private String substringBracket(String string) {
		String replacedString = string.replace("(", "");
		replacedString = replacedString.replace(")", "");
		return replacedString;
	}

	@Test
	@DisplayName("charAt()으로 인덱스 찾기 테스트")
	void findIndex() {
		String string = "abc";
		int index = 3;

		assertThat(findIndex(string, 0)).isEqualTo('a');
		assertThat(findIndex(string, 2)).isEqualTo('c');
		assertThatThrownBy(() -> {
			findIndex(string, 3);
		}).isInstanceOf(StringIndexOutOfBoundsException.class)
			.hasMessageContaining("String index out of range: " + index);
	}

	private char findIndex(String string, int index) {
		if (string.length() < index)
			throw new StringIndexOutOfBoundsException();
		return string.charAt(index);
	}

}
