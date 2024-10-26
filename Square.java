public class Square {
	double sideLength;
	
	public Square(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public double perimeter() {
		return sideLength * 4;
	}
	
	public double area() {
		return sideLength * sideLength;
	}
}