package inheritanceandpolymorphism.inheritance.multilevel;

import java.util.Scanner;

public class Employee {
	
	int empId;
	String empName;
	float empSalary;
	enum gender {
		male,
		female
	}
	String empGender;
	
	/**
	 * readEmployeeInformation method is used to store data of the
	 * employee
	 */
	Scanner sc = new Scanner(System.in);
	void readEmployeeInformation() {
		System.out.println("Enter Employee Details.......");
		System.out.println("Enter Employee Id ");
		empId = sc.nextInt();
		System.out.println("Enter Employee Name ");
		sc.nextLine();
		empName = sc.nextLine();
		System.out.println("Enter Employee Salary ");
		empSalary = sc.nextFloat();
		System.out.println("Enter Employee Gender ");
		empGender = sc.next();
	}
	
	void viewEmployeeInformation() {
		System.out.println("Employee Details are ........");
		System.out.println("Employee Id " + empId);
		System.out.println("Employee Name " + empName);
		System.out.println("Employee Salary "+empSalary);
		System.out.println("Employee Gender "+ gender.valueOf(empGender));
	}
	

}
