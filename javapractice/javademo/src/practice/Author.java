package practice;

import java.util.Scanner;

public class Author {

	
	//following are the instance variables of Book(Attributes)
	String name;
	String email;
	String gender;
	
	public String getName() {
		return name;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	

	
	
	Scanner sc = new Scanner(System.in);
	public void readAuthorDetails() {
		
		System.out.println("Enter the Author Details");
		System.out.println("Enter the Author name");
		name = sc.next();
//		System.out.println("Enter the email Name");
//		email= sc.nextLine();
		
		System.out.println("Enter gender");
		gender =sc.next();
		
	}
	
	public void print() {
		
		System.out.println("The Author Details");
		System.out.println("name = " +name);
		 
		System.out.println("email = "+ email);
		
		System.out.println("gender = "+ gender);
		
	}
	public static void main(String[]args) {
		
		Author A = new Author();
		A.readAuthorDetails();
		A.getName();
		A.setEmail("Komalp@gmail.com");
		A.getEmail();
		A.getGender();
		//A.print();
	
		
	}

	 }

   
