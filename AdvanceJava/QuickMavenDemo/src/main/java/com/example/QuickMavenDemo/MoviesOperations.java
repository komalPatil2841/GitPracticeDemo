package com.example.QuickMavenDemo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MoviesOperations {

	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static Statement stmt = null;
	static Scanner sc = new Scanner(System.in);
	public MoviesOperations() {
		conn = DBConnection.getDBConnection();
	}
	char ch = 'y';
	
	public void mainMenu() {
		while(ch=='y') {
		System.out.println("============================================================");
		System.out.println(" HELLO ! WELCOME TO THE MOVIE WORLD");
		System.out.println("============================================================");
		System.out.println("Please Enter  your choice");
		System.out.println("add : to insert a movie in our list");
		System.out.println("update : to udate the movie details");
		System.out.println("delete : to delete movie from our list");
		System.out.println("selectmovie : to view a specific movie details");
		System.out.println("viewall : to view all movies details");
		sc.nextLine();
		String choice = sc.nextLine();
		
		switch (choice) {
		case "add":
			 addMovie();
			break;
		case "update":
			updateMovie();
			break;
		case "delete":
			deleteMovie();
			break;
		case "viewall":
			selectAllMovies();
			break;
		case "selectmovie":
			selectMovieById();
			break;
		default:
			System.out.println("you have entered invalid option");
			break;
		}
			System.out.println("do you want to continue");
			ch = sc.next().charAt(0);
		}
	}

	private void deleteMovie() {
      try {
			
			String deleteStmt = "delete from MoviesInfo1 where movieId = ?";
			 pstmt = conn.prepareStatement(deleteStmt);
			//read the values and set the values to the ?
			System.out.println("Enter the movie id to delete");
			int mid = sc.nextInt();
			pstmt.setInt(1, mid);
			int i =pstmt.executeUpdate();
			if(i != 0) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("Not deleted as supervisior with id = " + mid + " not found");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void selectMovieById() {
		try {
			
			String selectStmt = "select * from MoviesInfo1 where movieId = ?";
			 pstmt = conn.prepareStatement(selectStmt);
			
			System.out.println("Enter the movie id to view details");
			
			int mid = sc.nextInt();
			pstmt.setInt(1, mid);
			
			ResultSet rs = pstmt.executeQuery();		
				System.out.println("movie found successfully");
				System.out.println("movie details are .........");
				while(rs.next()) {
					System.out.println("Movie Id :=" + rs.getInt("movieId"));
					System.out.println("Movie Name :=" + rs.getString("movieName"));
					System.out.println("moive language :=" + rs.getString("movieLanguage"));
					System.out.println("movie Type :=" + rs.getString("movieType"));
					System.out.println("Movie Rating :=" + rs.getInt("movieRating"));
				}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void selectAllMovies() {
try {
			
			String selectStmt = "select * from MoviesInfo1";
			 pstmt = conn.prepareStatement(selectStmt);
			ResultSet rs = pstmt.executeQuery();	
			System.out.println("----------------------------------------------------------------------------------------------------------------");
			System.out.println("movie details are .........");
			System.out.println("===============================================================================================================");
			System.out.println("Movie ID" + "\t" + "Movie Name" + "\t" + "Movie language" + "\t" + "Movie type" + "\t" + "Movie rating");
			System.out.println("================================================================================================================");
	
			while(rs.next()) {
					System.out.println(rs.getInt("movieId") + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4) + "\t\t" + rs.getInt(5));
					
				}
			System.out.println("----------------------------------------------------------------------------------------------------------------");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void updateMovie() {
		try {
			
			String updateStmt = "update MoviesInfo1 set movieName = ? where movieId = ?";
			 pstmt = conn.prepareStatement(updateStmt);
			//read the values and set the values to the ?
			System.out.println("Enter the movie details to update");
			System.out.println("enter movie name to update...");
			String sname = sc.nextLine();
			pstmt.setString(1, sname);
			System.out.println("enter movie id to update...");
			int mid = sc.nextInt();
			pstmt.setInt(2, mid);
			int i =pstmt.executeUpdate();
			if(i != 0) {
				System.out.println("updated successfully");
			}else {
				System.out.println("Not updated as supervisior with id = " + mid + " not found");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void addMovie() {
		//step1 => to register the driver
				try {
					
					String insertStmt =  
							"insert into MoviesInfo1 "
							+ "(movieName,movieLanguage,movieType,movieRating) "
							+ "values(?,?,?,?);";
				//step 3 => Create statement
					 pstmt = conn.prepareStatement(insertStmt);
					//read the values and set the values to the ?
				
					System.out.println("Enter the movie details");
					
					System.out.println("enter movie name...");
					//sc.nextLine();
					String mname = sc.nextLine();
					pstmt.setString(1, mname);
					System.out.println("Enter movie language...");
					String mlang = sc.nextLine();
					pstmt.setString(2, mlang);
					System.out.println("Enter the movieType");
					String mtype = sc.nextLine();;
					pstmt.setString(3, mtype);
					System.out.println("Enter the movie rating");
					int mrating = sc.nextInt();;
					pstmt.setInt(4, mrating);
					// step 4 => Execute the statement
					int i =pstmt.executeUpdate();
					// step 5 => show the results
					if(i != 0) {
						System.out.println("movie added successfully");
					}else {
						System.out.println("movie not added");
					}
				} catch (Exception e) {
					
					e.printStackTrace();
				}

		
	}

	
}
