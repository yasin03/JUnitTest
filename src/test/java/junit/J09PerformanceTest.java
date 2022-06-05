package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class J09PerformanceTest {

	@Test
	@Disabled // --> testin disable edilmesini saðlar. 
	void testPrintPerformance() {
		assertTimeout(Duration.ofSeconds(1), ()->IntStream.rangeClosed(1, 100000).forEach(System.out::println));
	}
	
	@Test
	void testPrintPerformance2() {
		assertTimeout(Duration.ofSeconds(10), 
				()->IntStream.rangeClosed(1, 10000).reduce((x,y) -> Math.addExact(x, y)));
	}

}




