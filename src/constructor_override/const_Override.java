package constructor_override;

public class const_Override {
	
	// constructor override
	int a,b,c,d,e;
	String name,uni_name;
	const_Override(){
		System.out.println("Hi This is a first constructor");
	}
	const_Override(int a){
		this.a = a;
	}
	const_Override(int b,int a){
		this.a = a;
		this.b = b;
	}
	const_Override(int c,int d,int e){
		this.c = c;
		this.d = d;
		this.e = e;
	}
	const_Override(String name){
		this.name = name;
	}
	
	void display() {
		System.out.println("Number is : "+a);
		System.out.println("Number is : "+a+b);
		System.out.println("Number is : "+c+d+e);
		System.out.println("Your Name is : "+name);

	}
	
}
