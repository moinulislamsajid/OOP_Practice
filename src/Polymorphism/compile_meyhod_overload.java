package Polymorphism;

public class compile_meyhod_overload {
	void add() {
		System.out.println("There is no Parameter passing this method and this also first method for for class");
	}
	int add(int x){
		return x;
	}
	int add(int x,int y) {
		int res = x*y;
		return res;
	}
	int add(int x,int y,int z) {
		int result = x+y+z;
		return result;
	}
	double add(double x,double y) {
		double fi_value = x / y;
		return fi_value;
	}

	String add(String name) {
		return name;
	}
}
