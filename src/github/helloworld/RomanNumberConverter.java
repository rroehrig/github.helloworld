package github.helloworld;

public class RomanNumberConverter {

	static int[] integer = { 10, 9, 5, 4, 1 };
	static String[] rum = { "X", "IX", "V", "IV", "I" };

	public Integer convert(String romanNumerals) {
		int result = 0;
		for (int i = 0; i < integer.length; i++) {
			while (romanNumerals.startsWith(rum[i])) {
				romanNumerals = romanNumerals.substring(1, romanNumerals.length());
				result += integer[i];
			}
		}
		return result;
	}
}
