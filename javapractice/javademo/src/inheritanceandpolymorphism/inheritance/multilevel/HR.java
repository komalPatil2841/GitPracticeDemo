package inheritanceandpolymorphism.inheritance.multilevel;



public class HR extends Employee{
	
	String role;
	
	void readRole() {
		System.out.println("Enter the role");
		sc.nextLine();
		role = sc.nextLine();
	}
	void viewRole() {
		System.out.println("The role "+role );
	}
}