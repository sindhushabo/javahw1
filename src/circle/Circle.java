package circle;

public class Circle {
	private double radius;
	private double area;
	 
	   public Circle( )
	     {
	        radius = 0;
	        area = 0;
	     }
	  public Circle( double radius )
	     {
	        this.radius = radius;
	     }
	  public void setRadius( double radius )
	     {
	        this.radius = radius;
	     }
	  public double getRadius()
	     {
	        return radius;
	     }
	  public void setArea()
	     {
	        area = (radius)*(radius)*Math.PI;
	     }
	  public double getArea()
	     {
	        return area;
	     }

}
