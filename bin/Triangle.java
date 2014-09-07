/*
* Calculate Shape Volume, Area and Perimeter
* @Author: Jamie Yiw
* @Date: 07/09/2014
*/

//Triangle Object
public class Triangle extends Shape{

	double Side1;
	double Side2;
	double Side3;
	double Altitude;
	double Base;
	double Height;
	
	//Constructor
	Triangle(double _side1, double _side2, double _side3,  double _altitude, double _base, double _height){
		Side1 = _side1;
		Side2 = _side2;
		Side3 = _side3;
		Altitude = _altitude;
		Base = _base;
		Height = _height;
	}
	
	double getArea() { 
		return Altitude * Base * (Side1 + Side2 + Side3) * Height;
	}
	double getPerimeter () {
		return Side1 + Side2 + Side3;
	}
	double getVolume() { 
		return .5 * (Altitude * Base * Height);
	}
}
