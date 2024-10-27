import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleTests {

	@Test
	void testHashCode() {
		Point p = new Point(0,0);
		Circle c = new Circle(p, 1);
		assertEquals(c.hashCode(), 7);
	}
	
	@Test
	void testPeramter() {
		Point p = new Point(0,0);
		Circle c = new Circle(p, 1);
		assertTrue(c.peramter() -  2*Math.PI < 0.0001);
	}
	
	@Test
	void testIsUnit() {
		Point p = new Point(0,0);
		Circle c = new Circle(p, 2);
		assertFalse(c.isUnit());
	}
	
	@Test
	void testIsUnit2() {
		Point p = new Point(0,0);
		Circle c = new Circle(p, 1);
		assertTrue(c.isUnit());
		
	}

}
			