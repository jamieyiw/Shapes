
public class Circle extends Shape{

	double Radius;
	double Height;
	
	//Constructor
	Circle(double _radius, double _height){
		Radius = _radius;
		Height = _height;
	}
	
	double getArea() { 
		return 2 * Math.PI * Radius * Height + (2 * Math.PI * Math.pow(2, Radius));
	}
	double getPerimeter () {
		return 2 * Math.PI * Radius; 
	}
	double getVolume() { 
		return Math.PI * Math.pow(2,Radius) * Height; 
	}
	
}
