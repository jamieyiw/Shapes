
public class Pentagon extends Shape{
	
	double Base;
	double Height;
	
	//Constructor
	Pentagon(double _base_edge, double _height){
		Base = _base_edge;
		Height = _height;
	}

	double getArea() { 
		return 5 * Base * Height + .5 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)) * Math.pow(2,Base));
	}
	double getPerimeter () {
		return Base * 5;
	}
	double getVolume() { 
		return .25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)) * Math.pow(2,Base) * Height);
	}

}
