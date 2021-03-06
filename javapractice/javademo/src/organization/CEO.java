package organization;

public class CEO {
	 private String login,password ;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	CEO(){
		System.out.println("Inside A CEO class default constructor");
	}
	
	CEO(String login,String password){
		this.login=login;
		this.password=password;
		System.out.println("Inside A CEO class copy constructor" );
	}

	protected void print() {
		System.out.println("Inside A CEO class protected print method");
		System.out.println("login   =  "+login);
		System.out.println("Password =  "+password);
	}
}
