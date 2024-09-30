package RedBusApplication;
import java.util.*;
public class Driver {
 
    static RedBus[] r;
    static Payment p;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Redbus");
		System.out.println("1. Login\n2. New User \n3. Exit");
		System.out.print("Select input: ");
		int input=sc.nextInt();
		boolean flag=true;
		
				switch(input) {
				case 1:{
					 Login.login();
					 break;
				}
				case 2:{
				   NewUser.newuser();
				   break;
				}
				case 3:{
					Exit.exit();
					break;
				}
				}
	if(r!=null) {
		for(RedBus t : r) {
			System.out.println(t);
		}
	}
		
		
	}

	}
