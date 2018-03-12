
public class Circle {
	
	double radius;
	double diameter;
	double circumference;
	double area;

	 final static float pi = 3.14f;
	
	public Circle(double radius, double diameter) {
	
		this.radius = radius;
		this.diameter = diameter;
	}

	public void areaofcircle() {
		if(this.radius != 0) {
			area = pi*radius*radius;
		}
		else {
			System.err.println("Radius not defined");
		}
	}
	
	public void circumofcircle() {
		if(radius != 0) {
			circumference = 2*pi*radius;
		}
		else {
			System.err.println("Radius not defined");
		}
	}

}
