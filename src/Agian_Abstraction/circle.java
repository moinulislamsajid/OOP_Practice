package Agian_Abstraction;

public class circle extends shape {

	double r;
	circle(double r){
		this.r = r;
	}
	@Override
	void display() {
		double res = 3.1416 * r * r;
		System.out.println("The Radious of circle : "+res);
	}
}
