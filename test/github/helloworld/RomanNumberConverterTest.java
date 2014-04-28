package github.helloworld;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RomanNumberConverterTest {

	private RomanNumberConverter converter = new RomanNumberConverter();

	@Test
	public void testRomanOne() throws Exception {
		assertThat(converter.convert("I"), is(1));
	}

	@Test
	public void testRomanTwo() throws Exception {
		assertThat(converter.convert("II"), is(2));
	}

	@Test
	public void testRomanFive() throws Exception {
		assertThat(converter.convert("V"), is(5));
	}

}
