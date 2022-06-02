package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J01Assertions {

	@Test
	void test() {
		//fail("Not yet implemented");
	}

	@Test
	void testLength() {
		int actualLength = "Merhaba".length();
		int expectedLength = 7;
		
		//assertEquals(actualLength, expectedLength, "Actual length are not matched");
		
		assertTrue(expectedLength==actualLength, "Actual length is not matching with expected length");
		
		//assertFalse(expectedLength==actualLength);
	}
	
	@Test
	void testUpperCase() {
		String actualValue = "hello".toUpperCase();
		String expectedValue = "HELLO";
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testContainsMethod() {
		assertEquals(false, "Bekir".contains("t"));
	}
	
	
	
	
}
