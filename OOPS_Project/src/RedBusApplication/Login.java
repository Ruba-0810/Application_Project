package RedBusApplication;
import java.util.*;

public class Login extends NewUser{
	static Scanner sc=new Scanner(System.in);
	private String phone;
	private String password;
	
	public Login(){
		
	}
	public Login(String phone,String password) {
		this.phone=phone;
		this.password=password;
	}
	public String getPhone() {
		return phone;
	}
	public String getpassword() {
		return password;
	}
    public static void login() {
    	System.out.print("Enter phone number: ");
		String phone=sc.next();
		System.out.println("Enter password: ");
		String password=sc.next();
		try {
			if((n.getPhone().equals(phone) && n.getPassword().equals(password))) {
				   RedBus.redBus();
				}else {
					System.out.println("There is no your Account");
				}
		}catch(NullPointerException e) {
			System.out.println("Please do registration");
			NewUser.newuser();
		}
		
	
		 
    }
}
