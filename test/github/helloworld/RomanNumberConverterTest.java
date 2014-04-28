package github.helloworld;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RomanNumberConverterTest {

	private RomanNumberConverter converter = new RomanNumberConverter();

	@Test
	public void testRomanLiterals() throws Exception {
		assertThat(converter.convert("I"), is(1));
		assertThat(converter.convert("II"), is(2));
		assertThat(converter.convert("III"), is(3));
		assertThat(converter.convert("V"), is(5));
	}

}
