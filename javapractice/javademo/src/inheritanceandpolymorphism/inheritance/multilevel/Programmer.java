package inheritanceandpolymorphism.inheritance.multilevel;



public class Programmer extends Employee{
	
	String[] technologies = { "MySql","Java","Spring","Spring Boot"};
	String projectName;
	
	void readProgrammerInformation() {
		readEmployeeInformation();
		System.out.println("Enter the project Name");
		sc.nextLine();
		projectName = sc.nextLine();
		
	}
	void viewProgrammerInformation() {
		System.out.println("Programmer Details are ........");
		viewEmployeeInformation();
		System.out.println("Project Name " + projectName);
		System.out.println("Technologies used ..... ");
		for (String tech : technologies) {
			System.out.print(tech + "\t");
		}
	}

}