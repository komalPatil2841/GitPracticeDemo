package simple;

import java.util.Scanner;

public class ReverseArrayQ5 {
	public static void main(String args[]) {
	   Scanner in = new Scanner(System.in);
       int arr[] = new int[10];
       
       System.out.println("Enter 10 numbers");
       for (int i = 0; i < arr.length; i++) {
           arr[i] = in.nextInt();
       }
       
       System.out.println("Array Elements are");
       for (int i = 0; i < arr.length; i++) {
    	   System.out.print(arr[i]+ " "); 
       }
       System.out.println("Array in reverse order ");
       for (int i = arr.length-1; i > 0; i--) {
    	   System.out.print(arr[i]+ " "); 
       }
}
}
