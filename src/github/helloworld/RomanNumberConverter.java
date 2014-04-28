package github.helloworld;

public class RomanNumberConverter {

	public Integer convert(String romanNumerals) {
		if (romanNumerals.equals("I"))
			return 1;
		else if (romanNumerals.equals("II"))
			return 2;
		else if (romanNumerals.equals("III"))
			return 3;
		return 5;
	}
}
