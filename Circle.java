public class Circle {
	Point centre;
	double radius;
	
	public Circle(Point centre, double radius) {
		this.centre = centre;
		this.radius = radius;
	}
	
	@Override
	public int hashCode() {
		return (int)(3 * centre.x + 5 * centre.y + 7 * radius);
	}
	
	public double peramter() {
		return this.radius*2*Math.PI;
	}
	
	public boolean isUnit() {
		return this.radius == 1;
	}
	
}
