package inheritanceandpolymorphism.inheritance.multilevel;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		
	
//		 Object of Employee Employee e = new Employee();
		// e.readEmployeeInformation(); e.viewEmployeeInformation();
	
//		  /Object of the programmer Programmer prg = new Programmer();
		 //prg.readEmployeeInformation(); prg.readProgrammerInformation();
		  //prg.viewEmployeeInformation(); prg.viewProgrammerInformation();
		
		PythonDeveloper pdev = new PythonDeveloper();
		pdev.readProgrammerInformation();
		pdev.viewPythonDeveloperInformation();
		
		HR hr =new HR();
		hr.readEmployeeInformation();
		hr.readRole();
		hr.viewEmployeeInformation();
		hr.viewRole();

	}

}