package practice;

import java.util.Scanner;

public class AuthorManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// create a book object
		Author b = new Author();
		char ch = 'y';// local variable because it is defined inside main method

		while (ch == 'y') {
			System.out.println("Enter the Transaction.....");
			System.out.println("Enter 'read' to enter author details.....");
			System.out.println("Enter 'display' to view author details.....");
			String transaction = sc.next();

			switch (transaction) {
			case "read":
				b.readAuthorDetails();
				break;
			case "display":
				b.displyAuthorDetails();
				break;
			default:
				System.out.println("Wrong choice....");
				break;
			}// close of switch
			System.out.println("Enter the choice to continue.....");
			ch = sc.next().charAt(0);
		} // close of while



	}

}