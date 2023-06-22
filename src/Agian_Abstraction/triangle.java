package Agian_Abstraction;

public class triangle extends shape {

	double base,height;
	triangle(double base,double height){
		this.base = base;
		this.height = height;
	}
	@Override
	void display() {
		double res = 0.5 * base * height;
		System.out.println("Arae of Triangle : "+res);
	}
}
