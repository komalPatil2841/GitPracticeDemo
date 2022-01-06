package shapePractice;

import java.util.Scanner;

public class Shape {
 String color;
 boolean filled;
 Scanner sc = new Scanner(System.in);
  void getColor() {
	  System.out.println("Enter Color");
	  color=sc.nextLine();
  }
 void getFilled () {
	 System.out.println("Filled ");
	filled=sc.nextBoolean();
  }
 void printColor() {
	 System.out.println(" Color is "+color);
 }
void printfilled() {
	if (filled=true) {
		System.out.println("filled");
		
	}else
	System.out.println("empty");
	 
 }
}
