package polymorphism_Again;

public class compile_time {
	void add() {
		System.out.println("THIs is first method for method overloading");
	}
	int add(int x, int y) {
		int res = x+y;
		return res;
	}
	int add(int x,int y, int z) {
		int res1 = x+y+z;
		return res1;
	}
	double add(double c, double d) {
		double res = c*d;
		return res;
	}

}
