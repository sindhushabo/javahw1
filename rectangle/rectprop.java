package rectangle;

public class rectprop {

	public static void main(String[] args) {
		srprt sr = new srprt(10,4);
		System.out.println("the area of the rectangle is " + sr.area()+" sq units");
			sr.area(5f);
			sr.area(2.25);
			sr.area(11,12f);
			sr.area(11,12);
			sr.area(10,54,7f);

	}

}
