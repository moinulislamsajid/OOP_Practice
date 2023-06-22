package Static_method;

public class static_method {
	static void display() {
		System.out.println("Hi this is static method");
	}
	static void info() {
		//super.display .... cannot use super keyword in static method and this keyword
		System.out.println("This is special static method");
	}
	

}
