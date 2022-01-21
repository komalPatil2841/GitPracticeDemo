<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width">
<title>Insert title here</title>
</head>
<body>
<form action="StudentServlet" >
<input type="text" name="stud_id" placeholder="Enter Student Id"></br>
	<input type="text" name="stud_name" placeholder="Enter the Studnet name"></br>
	<input type="date"  name="stud_dob" placeholder="Enter the DOB"></br>
	<input type="text" name="stud_email" placeholder="Enter the Email"></br>
	<input type="text" name="stud_phon" placeholder="Enter the Phone Number"></br>
	<input type="text" name="stud_course" placeholder="Enter the Course Name"></br></br>
	<input type="submit" value = "submit">
</form>

</body>
</html>