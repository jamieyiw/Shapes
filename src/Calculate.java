
public class Calculate {

	public static void main(String[] args) {
		
		Circle foo = new Circle(1,4);
		System.out.println(foo.getArea());
		System.out.println(foo.getPerimeter());
		System.out.println(foo.getVolume());
		System.out.println("------------------------");
		
		Octagon oct = new Octagon(1,4);
		System.out.println(oct.getArea());
		System.out.println(oct.getPerimeter());
		System.out.println(oct.getVolume());
		System.out.println("------------------------");
		
		Pentagon pent = new Pentagon(1,4);
		System.out.println(pent.getArea());
		System.out.println(pent.getPerimeter());
		System.out.println(pent.getVolume());
		System.out.println("------------------------");
		
		Triangle tri = new Triangle(1,4,1,1,1,1);
		System.out.println(tri.getArea());
		System.out.println(tri.getPerimeter());
		System.out.println(tri.getVolume());
		
	}

}
