package constructor;

public class constructorOverride {
	
	constructorOverride(){
		System.out.print("Hi this is first it can not ant parameter");
	}
	constructorOverride(int x){
		System.out.println("hi this is :"+x);
	}
	constructorOverride(int x,int y){
		int res = x+y;
		System.out.println("THis is another some : "+res);
		
	}
	constructorOverride(String name){
		System.out.println("THis name : "+name);
	}
	
	

}
