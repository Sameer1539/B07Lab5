package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTests {

	@Test
	void testConstructor() {
		Square s = new Square(5);
		assertNotNull(s.sideLength);
	}
	
	@Test
	void testConstructor1() {
		Square s = new Square(5);
		assertEquals(s.sideLength, 5.0);
	}
	
	@Test
	void testperimeter() {
		Square s = new Square(3.0);
		assertEquals(s.perimeter(), 12.0);
	}
	
	@Test
	void testarea() {
		Square s1 = new Square(8);
		assertEquals(s1.area(), 64.0);
	}

}
