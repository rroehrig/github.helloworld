package github.helloworld;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RomanNumberConverterTest {

	private RomanNumberConverter converter = new RomanNumberConverter();

	@Test
	public void testRomanLiterals() throws Exception {
		convertAndAssert("I", 1);
		convertAndAssert("II", 2);
		convertAndAssert("III", 3);
		convertAndAssert("V", 5);
		convertAndAssert("X", 10);
	}

	private void convertAndAssert(String input, int expected) {
		assertThat(converter.convert(input), is(expected));
	}
}
