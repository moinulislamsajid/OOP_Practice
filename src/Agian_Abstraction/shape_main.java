package Agian_Abstraction;

public class shape_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a reference variable that is refer to another class to refer 
		shape info;
		info = new circle(10);
		info.display();
		
		info = new triangle(10,20);
		info.display();
		
		info = new rectangular(40,50);
		info.display();
	}

}
