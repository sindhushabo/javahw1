package rectangle;

public class srprt extends polygons {
	private double width, length;
	
	public srprt(double width, double length) {
        this.width = width;
        this.length = length;
    }
	//rectangle
	public double area() {
		return width * length;
    }
	//square
	void area(float radius)
    {
        System.out.println("the area of the square is "+Math.pow(radius, 2)+" sq units");
    }
	
    //circle
    void area(double side)
    {
        double z = Math.PI * (Math.pow(side, 2));
        System.out.println("the area of the circle is "+z+" sq units");
    }
    //parallelogram
    void area(int pbase, float pheight)
    {
        System.out.println("the area of the parallegogram is "+pbase*pheight+" sq units");
    }
    //rhombus
    void area(int rdia1, int rdia2)
    {
        System.out.println("the area of the rhombus is "+(rdia1*rdia2)/2+" sq units");
    }
    //trapezium
    void area(int tbase1,int tbase2, float theight)
    {
        System.out.println("the area of the trapezium is "+((tbase1*tbase2)/2)*theight+" sq units");
    }

}
