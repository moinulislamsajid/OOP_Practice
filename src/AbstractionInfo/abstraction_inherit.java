package AbstractionInfo;

public class abstraction_inherit extends abstraction {

	abstraction_inherit(double base,double height){
		super(base,height);
	}
	@Override
	void display() {
		double res = 0.5 * base * height;
		System.out.println(res);
	}
}
