package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MathFunctionsTest {

	MathFunctions mf;
	
	@BeforeEach
	void init() {
		mf = new MathFunctions();
	}
	
	@AfterEach
	void complete() {
		System.out.println("end of exe");
	}
	
	@BeforeAll
	void beforeAll() {
		System.out.println("before all exe");
	}
	
	@AfterAll
	void afterAll() {
		System.out.println("after all exe");
	}
	
	@Test
	@Tag("runit")
	void testAdd() {
		int e = 3;
		int a = mf.add(1, 2);
		assertEquals(a, e, "added"); 
	}

	@Test
	@Tag("runit")
	void testSub() {
		int e = -1;
		int a = mf.sub(1, 2);
		assertEquals(a, e, "subed"); 
	}

	@Test
	void testMul() {
		int e = 2;
		int a = mf.mul(1, 2);
		assertEquals(a, e, "muled"); 
	}

	@Test
	@DisplayName("AssertAll example")
	@Disabled
	void testDiv() {
		int e = 0;
		int a = mf.div(1, 2);
		
		assertAll(
				()->assertEquals(a, e, "dived"),
				()->assertThrows(Exception.class, ()->mf.div(1, 0), ()->"dived excep")
		);
	}	
	
	@Test
	@RepeatedTest(5)
	void testSam() {
		System.out.println("testsam");
	}
}
