
public class Octagon extends Shape{
	
	double Base;
	double Height;
	
	//Constructor
	Octagon(double _base_edge, double _height){
		Base = _base_edge;
		Height = _height;
	}
	
	double getArea() { 
		return 8 * Base * Height + (1 + Math.sqrt(2)) * Math.pow(2, Base);
	}
	double getPerimeter () {
		return Base * 8;
	}
	double getVolume() { 
		return 2 * (1 + Math.sqrt(2)) * Math.pow(2, Base) * Height;
	}

}
