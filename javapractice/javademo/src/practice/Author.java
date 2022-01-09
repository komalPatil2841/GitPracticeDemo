package practice;

import java.util.Scanner;

public class Author {
	
	String authorName;
	String bookName;
	String gender;
	String publishedDate;
	int no_of_books;
	Scanner sc = new Scanner(System.in);
	public void readAuthorDetails() {
		
		System.out.println("Enter the Author Details");
		System.out.println("Enter the Author Name");
		authorName = sc.next();
		System.out.println("Enter the Gender Author");
		gender=sc.next();
		System.out.println("Enter the  Book Name Written By Author");
		sc.nextLine();
		bookName = sc.nextLine();
	
		System.out.println("Enter the publishedDate of book");
		
				publishedDate = sc.next();

		System.out.println("Enter the no_Of_books written by Author");
		no_of_books = sc.nextInt();
	}
	
	public void displyAuthorDetails() {
		
		System.out.println("The Author Details");
		
		System.out.println("Author Name = "+authorName);

		System.out.println("Gender of author = "+gender);
		
		
		System.out.println("Book Nmae = "+bookName);

		
		
		
		System.out.println("Published Date = " +publishedDate);

		System.out.println("no_Of_Pages = "+no_of_books);
		
	}
}

	


