package simple;

public class SortArrayQ9 {
	
	
	public static void main(String[]args)
	    {
	        
	        int arr[] = {64,25,12,22,11};
	        int n = arr.length;
	   	 	      
			        for (int i = 0; i < n-1; i++)
			        {
			           	 int a = i;
			               for (int j = i+1; j < n; j++)
			                if (arr[j] < arr[a])
			                   a= j;
			 			      
			            int temp = arr[a];
			            arr[a] = arr[i];
			            arr[i] = temp;
			         }
	        System.out.println("Sorted array");
	      
	        for (int i=0; i<arr.length; ++i) {
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	    }
	}

