package Agian_Abstraction;

public class rectangular extends shape{
	double length,width;
	// create a constructor
	rectangular(double length, double width){
		this.length = length;
		this.width = width;
	}
	@Override
	void display() {
		double res = length * width;
		System.out.println("THe area is REctangular : "+res);
	}

}
