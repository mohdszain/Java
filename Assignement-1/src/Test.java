
public class Test {

	public static void main(String[] args) {
		Circle c = new Circle(3.0, 6.0);
		//c.radius = 3;
		//c.diameter = 6;
		
		c.areaofcircle();
		c.circumofcircle();
		
		System.out.println("Area of the circle is:"+c.area);
		System.out.println("Circumference of the circle is:"+c.circumference);

	}

}
