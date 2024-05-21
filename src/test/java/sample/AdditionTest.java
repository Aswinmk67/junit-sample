package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void testAdd() {
		Addition a = new Addition();
		int expected = 30;
		int actual = a.add(10, 20);
		assertEquals(expected, actual);
	}

}
