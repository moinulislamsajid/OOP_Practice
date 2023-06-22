package polymorphism_Again;

public class compile_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compile_time info = new compile_time();
		info.add();
		int x =info.add(10,20);
		System.out.println("Add this value : "+x);
		
		int y = info.add(10, 10,10);
		System.out.println("Add This value : "+y);
		
		double z = info.add(10.0, 30.34);
		System.out.println("This is multiflication : "+z);
	}

}
