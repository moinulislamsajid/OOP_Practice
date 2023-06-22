package static_counting;

public class static_count {
	static int count=0;
	
	static_count(){
		count++;
	}
	void display() {
		System.out.println(" Total Student : "+count);
	}

}
