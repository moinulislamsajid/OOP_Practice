package Abstraction;

public class local_minister implements Prime_Minister,General_Minister {

	@Override
	public void local_Area() {
		System.out.println("this is also local minister");
	}
	
	@Override
	public void general_minister() {
		System.out.println("This is also general power minister");
	}
}
