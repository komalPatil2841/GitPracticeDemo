package organization;

public class Report extends CEO {
	
	String time;
	 String rDate;
	 String task;
	 String project ;
	public Report( String t,String date,String t1, String pname ) {
		time=t;
		rDate=date;
		task=t1;
		project=pname ;
		System.out.println(" Report copy constructor ");
		
		
		
	}
	private void printReport() {
		System.out.println("Project time ="+time);
		System.out.println("Project date = "+rDate);
		System.out.println("Project name="+ project);
		System.out.println("Project task ="+task);
	
	}

	public static void main(String[] args) {
		
		Report r = new Report("10.15","12June","ADD Product Info","MouriProject");
		Employee1 e= new Employee1();
		e.setEid(101);
		System.out.println(e.getEid());
		e.setElogin("EMP_login_Report" );
		
		System.out.println(e.getElogin());
		e.setePassword("password_CEO");
		System.out.println(e.getePassword());
	
		r.printReport();
		

	}

}
