<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String StudentPhone = request.getParameter("phone");
	
	if(StudentPhone.equals ("7745064766") ){
		out.println("Student is registered ");
		
	}else {
		out.println("Please Do Registration for Course  ");
		RequestDispatcher rd1 = request.getRequestDispatcher("StudentRegistration.jsp");
		rd1.include(request, response);
	}
%>
</body>
</html>