package practice;

import java.util.Scanner;

public class Employee{

	
	int empId;
	String empName;
	float empSalary;
	String empDept;
	float empAge;
	
	

Scanner sc = new Scanner(System.in);
void readEmpInfo() {
	System.out.println("Enter Employee details");

	System.out.println("Enter Employee Id");
	empId=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Employee Name");
	empName=sc.nextLine();
	System.out.println("Enter Employee salary");
	empSalary=sc.nextFloat();
	System.out.println("Enter Employee department");
	empDept=sc.nextLine();
	System.out.println("Enter Employee age");
	empAge=sc.nextInt();
}
void printEmpInfo() {
	System.out.println("Enter Employee details");

	System.out.println("Enter Employee Id" +empId);
	
	System.out.println("Enter Employee Name" +empName);
	
	System.out.println("Enter Employee salary"+empSalary);
	
	System.out.println("Enter Employee gender"+empDept);
	System.out.println("Enter Employee gender"+empAge);
	
}
}
