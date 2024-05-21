package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayDemoTest {

	@Test
	void testReturnArray() {
		ArrayDemo ad = new ArrayDemo();
		int[] actual = ad.returnArray();
		int[] expected = {1,2,3};
		assertArrayEquals(expected, actual);
	}

}
