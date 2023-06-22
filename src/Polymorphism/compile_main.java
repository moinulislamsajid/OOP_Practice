package Polymorphism;

public class compile_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compile_meyhod_overload info = new compile_meyhod_overload();
		info.add();
		int x = info.add(5);
		System.out.println("X is : "+x);
		
		int hey = info.add(20, 30);
		System.out.println("Result : "+hey);
		
		int bah = info.add(20, 30, 40);
		System.out.println("Result is : "+bah);
		
		double lol = info.add(24.5, 56.56);
		System.out.println("Result is : "+lol);
		
		String nam = info.add("Ayman Sajid");
		System.out.println("Name  = "+nam);
		

		
	}

}
