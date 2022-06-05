package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03CompareArrayElement {

	List<String> arr = new ArrayList<>();

	public <T> boolean compareElementsOfTwoArray(T[] a1, T[] a2) {
		Arrays.sort(a1);
		Arrays.sort(a2);

		if (Arrays.equals(a1, a2)) {
			return true;
		} else {
			return false;
		}
	}
}
