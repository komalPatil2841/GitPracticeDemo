package com.mouritech.departmentmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name = "department_table")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "departmentid")
	private int deptId;
	
	@Column(name = "departmentname")
	@Size(min=3)
	private String deptName;
	
 public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	
public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

public Department(int deptId, @Size(min = 3) String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}


public Department(@Size(min = 3) String deptName) {
	super();
	this.deptName = deptName;
}

//	@Column(name = "departmentemail")
//	@Email
//	private String empEmail;
//	
//	@Column(name = "departmentmobno")
//	@Pattern(regexp = "[0-9]", message="mobile number contains only digits")
//	private String empMobileNo;
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

	
	
	
	
	

}
