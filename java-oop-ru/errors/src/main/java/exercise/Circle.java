package exercise;

// BEGIN
public class Circle {
	private int radius;
	private Point point;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Circle(Point point ,int radius) {
		this.radius = radius;
		this.point = point;
	}
	public double getSquare() throws NegativeRadiusException {
		if (radius < 0) {
			throw new NegativeRadiusException("Радиус отрицателен");
		}
		return Math.PI * radius * radius;
	}
}
// END
