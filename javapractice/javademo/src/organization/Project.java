package organization;

public class Project extends CEO {
	int id;	
	String name;
	int taskId;
		String access;
	public Project(int id,String name,int taskId,String access) {
		super("CEO_LOGIN","CEOPASSWORD");
		 this.id =id ;
				 this.name =name;
				 this.taskId =taskId;
				 this.access=access;
				 System.out.println("Inside A Project class ");
					
	}
	 void printProjectInfo(){
		 System.out.println("Project Details ");
		System.out.println("Project Name  =  "+name);
		System.out.println("Project Access  =  "+access);
		System.out.println("Task ID =  "+taskId);
	}

	public static void main(String[] args) {
		Project p= new Project(45565,"MouriProject",45,"yes");
		p.print();
		p.printProjectInfo();

	}

}
