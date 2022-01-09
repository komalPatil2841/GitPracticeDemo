package inheritanceandpolymorphism.inheritance.single;

public class Programmer extends Employee {
 String [] technologies= { "Mysql","Java","Spring boot"};
 String projectName;
 void readProgrammerInfo() {
	 sc.nextLine();
	 System.out.println("Enter Project Name");
	 projectName=sc.nextLine();
 }
 void viewProgrammerInfo() {
	 System.out.println(" Project Details");
	 System.out.println(" Project Name" +projectName);
	 System.out.println("Technologies used");
	 for(int i=0;i<technologies.length;i++) {
		 System.out.println(technologies[i]); 
	 }
	
	 
	
 }
}

