package com.example.JunitTestProject;

public class ArrayEqual {
 public int[] arrayDemoTest() {
	 int[] a= {1,2,3};
	 int[] b= {4,5,6};
	 int c[] = new int [a.length];
	 for(int i=0;i<a.length;i++) {
		 c[i]=a[i]+b[i];
	 }
	 for(int j=0;j<=c.length-1;j++) {
		 System.out.println("c[j]");
	 }
	 return c;
	 
	 
 }
}
