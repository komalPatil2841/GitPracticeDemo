package simple;

import java.util.*;

class Number

{
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int arr[] = new int[20];
        
        System.out.println("Enter 20 numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        
       
        int p=0,c=0,o=0,e=0,z=0;
        for (int i = 0; i < arr.length; i++) {
        	if ( arr[i]>0)

        		p++; //count of positive no's.

        		if  (arr[i]<0)

        		c++; //count of negative no's.

        		if (arr[i]%2==0)

        		e++; //count of even no's.

        		if (arr[i]%2!=0)

        		o++; //count of odd no's

        		if (arr[i]==0)

        		z++; //count of zeros


        }
        
        System.out.println("number of positive numbers ="+p);

        System.out.println("number of negative numbers ="+c);

        System.out.println("number of odd numbers ="+o);

        System.out.println("number of even numbers ="+e);

        System.out.println("number of zeroes ="+z);
    }
}


