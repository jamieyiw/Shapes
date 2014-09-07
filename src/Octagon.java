/*
* Calculate Shape Volume, Area and Perimeter
* @Author: Jamie Yiw
* @Date: 07/09/2014
*/

//Octagon Object
public class Octagon extends Shape{
	
	double Base;
	double Height;
	
	//Constructor
	Octagon(double _base_edge, double _height){
		Base = _base_edge;
		Height = _height;
	}
	
	double getArea() { 
		return 8 * Base * Height + 4 * (1 + Math.sqrt(2)) * Math.pow(2, Base);
	}
	double getPerimeter () {
		return Base * 8;
	}
	double getVolume() { 
		return 2 * (1 + Math.sqrt(2)) * Math.pow(2, Base) * Height;
	}

}
