package polymorphism;

public class Academic extends Payroll {
	
		int salary;
		public void adjustSalary(int salary) {
			this.salary=salary;
			System.out.println("salary =" +salary);
		}
		public void giveLecture() {
			System.out.println("Academic Info");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Payroll p = new Payroll();
			p.adjustSalary(500);
			Academic Ac=new Academic ();
			Ac.giveLecture();
			Ac.adjustSalary(50000);
		}

	}
