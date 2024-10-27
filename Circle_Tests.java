import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circle_test {

	@Test
	void testhashCode() {
		Point p = new Point(0,0);
		Circle A = new Circle(p, 1);
		assertEquals(A.hashCode(), 7);
	}
	
	@Test
	void testparamter() {
		Point p = new Point(0,0);
		Circle A = new Circle(p, 1);
		assertEquals(A.peramter(), 2*Math.PI);
	}
	
	@Test
	void testisNOTUnit() {
		Point p = new Point(0,0);
		Circle A = new Circle(p, 0);
		assertEquals(A.isUnit(), false);
	}
	
	@Test
	void testisUnit() {
		Point p = new Point(0,0);
		Circle A = new Circle(p, 1);
		assertEquals(A.isUnit(), true);
	}
}
