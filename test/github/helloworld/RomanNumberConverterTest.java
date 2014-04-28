package github.helloworld;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RomanNumberConverterTest {

	@Test
	public void testRomanOne() throws Exception {
		RomanNumberConverter converter = new RomanNumberConverter();
		assertThat(converter.convert("I"), is(1));
	}

	@Test
	public void testRomanTwo() throws Exception {
		RomanNumberConverter converter = new RomanNumberConverter();
		assertThat(converter.convert("II"), is(2));
	}

	@Test
	public void testRomanFive() throws Exception {
		RomanNumberConverter converter = new RomanNumberConverter();
		assertThat(converter.convert("V"), is(5));
	}

}
