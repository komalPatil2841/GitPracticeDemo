package inheritanceandpolymorphism.inheritance.single;


import java.util.*;
public class Employee{

	
		int empId;
		String empName;
		float empSalary;
		enum gender{
			male,female
		}
	String empGender;
		
	
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
		System.out.println("Enter Employee gender");
		empGender=sc.next();
	}
	void printEmpInfo() {
		System.out.println("Enter Employee details");
	
		System.out.println("Enter Employee Id" +empId);
		
		System.out.println("Enter Employee Name" +empName);
		
		System.out.println("Enter Employee salary"+empSalary);
		
		System.out.println("Enter Employee gender"+empGender);
		
	}
}
