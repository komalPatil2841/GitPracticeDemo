package simple;

//import java.util.*;
public class ArrayQ8 {
	
	    static int arr[] = new int[]{1, 2, 3, 4, 5};
	    
	   
	    static void rotate()
	    {
	       int x = arr[arr.length-1], i;
	       for (i = arr.length-1; i > 0; i--)
	          arr[i] = arr[i-1];
	       arr[0] = x;
	    }
	    
	   
	    public static void main(String[] args) 
	    {
	        System.out.println("orignal array");
	        for(int i=0;i<arr.length;i++) {
	        	System.out.print(arr[i]);
	        }
	        System.out.println();
	        
	        rotate();
	        
	        System.out.println("Rotated Array ");
	        for(int i=0;i<arr.length;i++) {
	        	System.out.print(arr[i]);
	        }
	        
	    }
	}

