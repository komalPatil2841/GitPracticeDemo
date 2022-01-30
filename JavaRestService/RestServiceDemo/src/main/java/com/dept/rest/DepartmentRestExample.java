package com.dept.rest;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;


 @Path("/api") 
public class DepartmentRestExample {
	
	ArrayList<Department> deptList = new ArrayList<Department>();
	
	@Path("/listemployees")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Department> getAllDepartments(){
		deptList = createDepartmentList();
		return deptList;
	}
	
	public ArrayList<Department> createDepartmentList() {
		deptList.add(new Department(123,"rama"));
		deptList.add(new Department(124,"ram"));
		deptList.add(new Department(125,"raghs"));
		return deptList;
	}

}

