package project1;

import java.util.Scanner;

public class Shop {
	
	// here the purchase rate 
	 int  pur_onion_price;
	 int pur_rice_price =40;
	 int pur_dal_price = 70;
	 int pur_sugar_price = 100;
	 @SuppressWarnings("unused")
	 Shop(int pur_onion_price){
		 this.pur_onion_price=pur_onion_price;
		 
	 }
	void coustomer_display() {
		 System.out.print("\t\t==========Welcome To Online Shop=======\n\n");
		 System.out.print("Main Menu :\n");
		 System.out.print("1. Rice(1kg=55)   : \n");
		 System.out.print("2. Onion(1kg=50)  : \n");
		 System.out.print("3. Sugar(1kg=120) : \n");
		 System.out.print("4. Dal(1kg=90)    : \n");
		 System.out.print("======================================\n");
		
	 }
	 void info() {

		
		 this.coustomer_display();
		 int ch;
		 System.out.print("ENter Choice(1-4) : ");
		 Scanner input = new Scanner(System.in);
		 ch = input.nextInt();
		 
		
		switch(ch) {
		case 1:
			System.out.print("How Much Need(from Integer) : ");
			int count;
			Scanner input1 = new Scanner(System.in);
			count = input1.nextInt();
			if(count==1) {
				int total_price = 55*1;
				System.out.println("Total price : "+total_price);
			}
			else if(count==2) {
				int total_price = 55*2;
				System.out.println("Total price : "+total_price);
			}
			else if(count==3) {
				int total_price = 55*3;
				System.out.println("Total price : "+total_price);
			}
			else if(count==4) {
				int total_price = 55*4;
				System.out.println("Total price : "+total_price);
			}
			else if(count==5) {
				int total_price = 55*5;
				System.out.println("Total price : "+total_price);
			}
			
				
				
		
		}

			
		}

	
	@SuppressWarnings("resource")
	void replay_information() {
		System.out.print("Continue to the choping y or n : ");
		char vh;
		Scanner input = new Scanner(System.in);
		vh = input.next().charAt(0);
		if(vh == 'y' || vh=='Y') {
			this.coustomer_display();
		}
		else {
			System.out.println("out here");
	 }
	 
	}
	void coustomer_bil(int total_price) {
		
		this.info();
		if(total_price==110) {
			System.out.println("Price :: 100/=");
			
		}
		
	}
	}
	
	
	

