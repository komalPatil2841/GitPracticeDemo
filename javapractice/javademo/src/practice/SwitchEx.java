package practice;
import java.util.*;
public class SwitchEx {

	
	    public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	       int num;
	 
	       while(true) {
	         
	            System.out.println("1. Calculate Factorial");
	            System.out.println("2. Reverse Number");
	            System.out.println("3. Palindrome Number");
	            System.out.println("4. perfact no");
	            System.out.println("5. Strong no");           
	            System.out.println("0. Exit");
	            System.out.print("Choose Option from 0 - 5: ");
	            int option = scn.nextInt();
	            
	            switch (option) {
	                case 1:
	                	        
	          	        System.out.print("Enter number: ");
	          	      num = scn.nextInt();
	          	                
	          	        if (num <= 1) {
	          	            num = 1;
	          	        } else {
	          	            for (int i = num; i >= 2; i--) {
	          	                num *= i;
	          	            }
	          	        }        
	          	        System.out.println("Factorial: " + num);
	                    break;
	                case 2:
	                	
	        	        
	        	        System.out.print("Enter any number: ");
	        	         num = scn.nextInt();
	        	        int reverse = 0;
	        	                
	        	        while(num > 0) {            
	        	            reverse = reverse * 10 + num % 10;
	        	            num /= 10;
	        	        }
	        	        
	        	        System.out.println("Reverse of entered number is " + reverse);
	                    break;
	                case 3:
	                	
	        	        
	        	        System.out.print("Enter any number: ");
	        	        num = scn.nextInt();
	        	        int num2 = 0;
	        	        
	        	        int temp = num;
	        	        while(temp > 0) {            
	        	            num2 = num2 * 10 + temp % 10;
	        	            temp = temp / 10;
	        	        }
	        	        
	        	        if (num == num2) {
	        	            System.out.println(num + " is a Palindrome number");
	        	        } else {
	        	            System.out.println(num + " is not Palindrome number");
	        	        }
	                    break;
	                case 4:
	                	System.out.print("Enter any number: ");
	        	        num = scn.nextInt();
	                   int sum=0;
	                  for(int i=1;i<num;i++) {
	                	   if(num % i==0) {
	                		   sum=sum+i;
	                	   }
	                	 
	                   }
	                   if(sum==num) {
	                	   System.out.println(num + " is Perfect No");
	                   }else
	                	   System.out.println(num + " is  not Perfect No");
	                    break;
	                case 5:
	                	System.out.print("Enter any number: ");
	        	        num = scn.nextInt();
	                   int total=0, tempt_n=num, fact_n,lastding;
	                   while(num!=0) {
	                	   int i=1;
	                	   fact_n=1;
	                	   lastding=num%10;
	                	   while(i<=lastding) {
	                		   fact_n=fact_n*i;
	                		   i++;
	                	   }
	                	   total=total+fact_n;
	                	   num=num/10;
	                	   
	                   }
	                   if(total==tempt_n) {
	                	   System.out.println(tempt_n + " is  Strong No");
	                   }else
	                	   System.out.println(tempt_n + " is  not Strong No");
	                    break;
	                case 6:              	
	                	System.exit(0);
	    	           
	    	            
	            }
//	            System.out.println();
//	            if(option == 6) {
//	            	
//	                break;
//	                
//	            }
	            scn.close();
	        } 
	       
	    }
	 
	    }
	