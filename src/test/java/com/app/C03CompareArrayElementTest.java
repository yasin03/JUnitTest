package com.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class C03CompareArrayElementTest {

	@ParameterizedTest
	@MethodSource("arrayProvider")
	void compareElementsOfTwoArraysTest(boolean rs, Object[] a1, Object[] a2) {
		C03CompareArrayElement obj = new C03CompareArrayElement();
		assertEquals(rs, obj.compareElementsOfTwoArray(a1, a2));
	}

	static Stream<Arguments> arrayProvider() {
		String[] s1 = { "a", "b" };
		String[] s2 = { "a", "b" };

		String[] s3 = { "a", "b" };
		String[] s4 = { "b", "a" };

		Integer[] i1 = { 1, 2, 3 };
		Integer[] i2 = { 3, 1, 2 };

		return Stream.of(Arguments.of(true, s1, s2), Arguments.of(true, s3, s4),
				Arguments.of(true, i1,i2));
	}

}
