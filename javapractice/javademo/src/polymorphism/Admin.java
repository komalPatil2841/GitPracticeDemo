package polymorphism;

public class Admin  extends Payroll  {
	int salary;
	public void adjustSalary(int salary) {
		this.salary=salary;
		System.out.println("salary =" +salary);
		
	}
	public void doAdminStuff() {
		System.out.println("Admin Info");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payroll p = new Payroll();
		p.adjustSalary(500);
		Admin A=new Admin ();
		A.doAdminStuff();
		A.adjustSalary(10000);
		
		

	}

}
