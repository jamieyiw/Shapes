/*
* Calculate Shape Volume, Area and Perimeter
* @Author: Jamie Yiw
* @Date: 07/09/2014
*/

public class Calculate {

	public static void main(String[] args) {
		
		Circle cir = new Circle(1,4);
		System.out.println("CIRCLE");
		System.out.println("Area: " + cir.getArea());
		System.out.println("Perimeter: " + cir.getPerimeter());
		System.out.println("Volume: " + cir.getVolume());
		
		Octagon oct = new Octagon(1,4);
		System.out.println("OCTAGON");
		System.out.println("Area: " + oct.getArea());
		System.out.println("Perimeter " + oct.getPerimeter());
		System.out.println("Volume: " + oct.getVolume());
		
		Pentagon pent = new Pentagon(1,4);
		System.out.println("PENTAGON");
		System.out.println("Area: " + pent.getArea());
		System.out.println("Perimeter " + pent.getPerimeter());
		System.out.println("Volume: " + pent.getVolume());
		
		Triangle tri = new Triangle(1,4,1,1,1,1);
		System.out.println("TRIANGLE");
		System.out.println("Area: " + tri.getArea());
		System.out.println("Perimeter " + tri.getPerimeter());
		System.out.println("Volume: " + tri.getVolume());
		
	}

}
