package organization;

public class Employee1 extends CEO {
	private int eid;
	private String elogin;
	private String ePassword;
	
	
	public  Employee1(){
		
	}
	public int getEid() {
		return eid;
				}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getElogin() {
		return elogin;
		
	}


	public void setElogin(String elogin) {
		this.elogin = elogin;
	}


	public String getePassword() {
		return ePassword;
	}


	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}


	public Employee1( int eid, String elogin,String ePassword) {
		super();
		this.eid=eid;
		 this.elogin=elogin;
		this.ePassword=ePassword;
		System.out.println("inside Employee class ");
		System.out.println("Employee details ");
		System.out.println("Employee Id  = "+eid);
		System.out.println("Employee Username = "+elogin);
		System.out.println("Employee Password   = "+ePassword);
		
		
	}
	

	public static void main(String[] args) {
		Employee1 e = new Employee1 (156,"Sumit","123");

	}

}
