package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class J05TestingExeptions {

	// Test etti�imiz kodun bizim bekledi�imiz exeption f�rlatt�m� test �rne�i
	@Test
	void testExeption1() {

		String str = "Hello World";

		assertThrows(NullPointerException.class, () -> {
			System.out.println("testExeption1 is run");
			str.length();
		});
	}

	@Test
	void testExeption2() {
		String str = "Java";

		// Yaz�lacak exeption tipi ya ayn�s� yada parenti olmal�d�r.
		assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt(str);
		});
	}

	@Test
	void testExeption3() {
		int x = 123;
		int y = 0;

		assertThrows(ArithmeticException.class, () -> {
			int result = x / y;
		});
	}

	@Test
	void testExeption4() {
		int x = 123;
		int y = 0;

		assertThrows(ArithmeticException.class, () -> divide(x, y));
	}

	private int divide(int x, int y) {
		return x / y;
	}

	@Test
	void testException5() {
		int age = -4;
		assertThrows(IllegalArgumentException.class, () -> checkAge(age));
	}

	private void checkAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException();
		} else {
			System.out.println(age);
		}
	}
}
