package com.mouritech.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerRegistrationServlet
 */
@WebServlet("/ProductServlet1")
public class ProductDetailServlet1 extends HttpServlet {
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
		int ProductId = Integer.parseInt(request.getParameter("prod_id"));
		String ProductName = request.getParameter("prod_name");
		int ProductPrice = Integer.parseInt(request.getParameter("prod_price"));
		String ProductCategory = request.getParameter("prod_cat");
		String ProductBrand = request.getParameter("prod_brand");
		
		
		con = DBConnection.getDBConnection();
		String insertCustomer = "insert into Product values(?,?,?,?,?);";
		
		pstmt = con.prepareStatement(insertCustomer);
		pstmt.setInt(1, ProductId);
		pstmt.setString(2, ProductName);
		pstmt.setInt(3, ProductPrice);
		pstmt.setString(4, ProductCategory);
		pstmt.setString(5, ProductBrand);
		int i = pstmt.executeUpdate();
		if(i != 0) {
			out.println(" <h1>inserted successfully"+" </h1>");
		}else {
			out.println("Not inserted");
		}
		out.println("<h1>  Product Name = " + ProductName + "</h1>");
		out.println(" <h1>Product Price  = "+ProductPrice+ "</h1>");
		out.println(" <h1>Product Category  = "+ProductCategory+ "</h1>" ); 
				out.println(" <h1>ProductBrand = " +ProductBrand+ "</h1>");
	}catch (Exception e) {
		e.printStackTrace();
	}
		
	}

}
