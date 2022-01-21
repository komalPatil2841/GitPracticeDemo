package com.mouritech.servelet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
//import java.util.Date;
//import java.sql.Date.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	static Connection con; // = null;
	static PreparedStatement pstmt; // = null;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//set response content type
	try {
		response.setContentType("text/html");
		//Here the text to be printed on the browser
		PrintWriter out = response.getWriter();
		//read the data entered in the html
		int StudentId = Integer.parseInt(request.getParameter("stud_id"));
		String StudentName = request.getParameter("stud_name");

		java.util.Date  StudentDob = new SimpleDateFormat("yyyy-mm-dd").parse(request.getParameter("stud_dob"));
		java.sql.Date  StudentDob1 = new java.sql.Date(StudentDob.getTime());
//		String Sudentdob =request.getParameter("stud_dob");
	    
//		DateTimeFormatter f=DateTimeFormatter.ofPattern("mm-dd-uuuu");
//		LocalDate  StudentDob1 =LocalDate.now();
	


		String  StudentEmail =request.getParameter("stud_email");
		String StudentPhone = request.getParameter("stud_phon");
		String StudentCourse = request.getParameter("stud_course");
		out.println("StudentInfo ");
		
		con = DBConnection.getDBConnection();
		String insertStudent = "insert into Student values(?,?,?,?,?,?);";
		
		
	
		pstmt = con.prepareStatement(insertStudent);
		pstmt.setInt(1, StudentId);
		pstmt.setString(2, StudentName);
		pstmt.setDate(3,StudentDob1);
		//pstmt.setString(3,StudentDob);
		pstmt.setString(4, StudentEmail);
		pstmt.setString(5, StudentPhone);
		pstmt.setString(6, StudentCourse);
		int i = pstmt.executeUpdate();
		if(i != 0) {
			out.println(" <h1>inserted successfully"+" </h1>");
		}else {
			out.println("Not inserted");
		}
		out.println("<h1>  Student Id = " + StudentId + "</h1>");
		out.println("<h1>  Student Name = " + StudentName + "</h1>");
		out.println("<h1>  Student DOB = " + StudentDob + "</h1>");
		out.println(" <h1>Student Emial  = "+StudentEmail+ "</h1>");
		out.println(" <h1>Student Phone  = "+StudentPhone+ "</h1>" ); 
				out.println(" <h1>StudentCourse = " +StudentCourse+ "</h1>");
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
