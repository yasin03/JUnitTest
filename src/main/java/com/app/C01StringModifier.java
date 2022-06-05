package com.app;

public class C01StringModifier {

	// AABC -> BC, ABC -> BC
	public String deleteAIfItIsinFirstTwoPosition(String str) {

		if (str.length() <= 2) {
			return str.replaceAll("A", "");
		}
		
		String firstTwoChar = str.substring(0,2);
		String afterTwoChar = str.substring(2);
		
		return firstTwoChar.replaceAll("A","")+afterTwoChar;

	}
	
}
