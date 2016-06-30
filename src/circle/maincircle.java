package circle;

public class maincircle {

	public static void main(String[] args) {
		 Circle c = new Circle();
		   c.setRadius(1);
		    c.setArea();
		   double d=c.getArea();
		 
		  System.out.println("The radius of the circle is: " + c.getRadius());
		  System.out.println("The area of the circle is:" +d);

	}

}
