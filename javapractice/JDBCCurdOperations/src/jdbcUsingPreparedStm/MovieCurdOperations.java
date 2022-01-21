package jdbcUsingPreparedStm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
//import com.mysql.cj.protocol.Resultset;
public class MovieCurdOperations {


	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static Statement stmt = null;
	static Scanner sc = new Scanner(System.in);
	public MovieCurdOperations(){
		conn = DBConnection.getDBConnection();
	}
	char ch = 'y';
	
	public void jdbcMenu() {
		while(ch=='y') {
		System.out.println("Enter the choice of JDBC Operation");
		System.out.println("insert : to insert the Movie data");
		System.out.println("update : to update the Movie data");
		System.out.println("delete : to delete the Movie data");
		System.out.println("selectone : to view a specific Movie data");
		System.out.println("selectall : to view all Movie data");
		sc.nextLine();
		String choice = sc.nextLine();
		
		switch (choice) {
		case "insert":
			insertMovie();
			break;
		case "update":
			updateMovie();
			break;
		case "delete":
			deleteMovie();
			break;
		case "selectall":
			selectAllMovies();
			break;
		case "selectone":
			selectMovieById();
			break;
		default:
			System.out.println("no case found....");
			break;
		}
			System.out.println("do you want to continue");
			ch = sc.next().charAt(0);
		}
	}

	private void deleteMovie() {
try {
			
			String deleteStmt = "delete from moives where movie_id = ?";
			 pstmt = conn.prepareStatement(deleteStmt);
			//read the values and set the values to the ?
			System.out.println("Enter the movie details to delete");
			System.out.println("enter movie id to update...");
			int mid = sc.nextInt();
			pstmt.setInt(1, mid);
			int i =pstmt.executeUpdate();
			if(i != 0) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("Not deleted as movie with id = " + mid + " not found");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void selectMovieById() {
		try {
			
			String selectStmt = "select * from moives where movie_id = ?";
			 pstmt = conn.prepareStatement(selectStmt);
			//read the values and set the values to the ?
			System.out.println("Enter the movie id to view details");
			//System.out.println("enter movie id to update...");
			int mid = sc.nextInt();
			pstmt.setInt(1, mid);
			//int i =pstmt.executeUpdate();
			ResultSet rs = pstmt.executeQuery();		
				System.out.println("movie found successfully");
				System.out.println("movie details are .........");
				while(rs.next()) {
					System.out.println("Movie Name :=" + rs.getString("moives_name"));
					System.out.println("Movie language :=" + rs.getString("movie_language"));
					System.out.println("Movie type :=" + rs.getString("movie_type"));
					System.out.println("Movie Rating :=" + rs.getString("movie_rating"));
				}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void selectAllMovies() {
try {
			
			String selectStmt = "select * from moives";
			 pstmt = conn.prepareStatement(selectStmt);
			ResultSet rs = pstmt.executeQuery();	
			System.out.println("movie details are .........");
			System.out.println("=======================================================================================================================================================================================================");
			System.out.println("Movie ID" + "\t" + "Movie Name" + "\t" + "Movie language" + "\t" + "Movie type" + "\t" + "Movie Rating");
			System.out.println("=======================================================================================================================================================================================================");
	
			while(rs.next()) {
					System.out.println(rs.getInt("movie_id") + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4) +"\t\t" + rs.getString(5));
					//System.out.println("Movie Name :=" + rs.getString("moives_name"));
					//System.out.println("Movie language :=" + rs.getString("movie_language"));
					//System.out.println("Movie type :=" + rs.getString("movie_type"));
				}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void updateMovie() {
		try {
			
			String updateStmt = "update moives set moives_name = ? where movie_id = ?";
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
				System.out.println("Not updated as movie with id = " + mid + " not found");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void insertMovie() {
		//step1 => to register the driver
				try {
					
					String insertStmt =  
							"insert into moives "
							+ "(moives_name,movie_language,movie_type) "
							+ "values(?,?,?);";
				//step 3 => Create statement
					 pstmt = conn.prepareStatement(insertStmt);
					//read the values and set the values to the ?
				
					System.out.println("Enter the movie details");
					
					System.out.println("enter movie name...");
					//sc.nextLine();
					String movie_name = sc.nextLine();
					pstmt.setString(1, movie_name);
					System.out.println("Enter movie language...");
					String movie_language = sc.nextLine();
					pstmt.setString(2, movie_language);
					System.out.println("Enter the movie type...");
					String movie_type = sc.nextLine();
					
					pstmt.setString(3, movie_type);
					sc.nextLine();
					String movie_rating = sc.nextLine();
					pstmt.setString(3, movie_rating);
					// step 4 => Execute the statement
					int i =pstmt.executeUpdate();
					// step 5 => show the results
					if(i != 0) {
						System.out.println("Inserted successfully");
					}else {
						System.out.println("Not inserted successfully");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		
	}


}
