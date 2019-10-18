package javafiles;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReusableFunctions {

	public String reverseString(String string) {
		return Stream.of(string).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
	}

	public boolean compareStrings(String string1, String string2) {
		if (string1.equals(string2))
			return true;
		else
			return false;
	}

}
