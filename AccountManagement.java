
public class AccountManagement { 
	
	
	String userName; 
	int UserId;
	
	
	
	public void updatePermisions () {
		System.out.println("called Update Permision");
	}
	
	public void updateUserName ( String name) { 
		
		this.userName =name;
		System.out.println("called update User Name");
		
	}
	
	
	public void customizeProfile () {
		System.out.println( " called customize profile");
	}
 	
	
}
