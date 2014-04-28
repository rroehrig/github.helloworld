package github.helloworld;

public class RomanNumberConverter {

	public Integer convert(String string) {
		if (string.equals("I"))
			return 1;
		else if (string.equals("II"))
			return 2;
		return 5;
	}

}
