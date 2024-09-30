package RedBusApplication;
import java.util.*;

public class NewUser {
	
	static Scanner sc= new Scanner(System.in);
	
	String name;
	int age;
	String gender;
	String Phone;
	String password;
	String conformPassword;
	boolean vaccinated;
	static NewUser n;
	
	public NewUser(){
		
	}
	public NewUser(String name,int age,String gender,String phone,String password,String conformPassword,boolean vaccinated) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.Phone=phone;
		this.password=password;
		this.conformPassword=conformPassword;
		this.vaccinated=vaccinated;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConformPassword() {
		return conformPassword;
	}
	public void setConformPassword(String conformPassword) {
		this.conformPassword = conformPassword;
	}
	public boolean isVaccinated() {
		return vaccinated;
	}
	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
	}
	public static void newuser() {
		boolean flag=true;
		while(flag) {
			System.out.print("Enter Name: ");
			String name=sc.next();
			System.out.print("Enter age: ");
			int age=sc.nextInt();
			System.out.print("Enter Gender: ");
			String gender=sc.next();
			System.out.print("Enter phone number: ");
			String phone=sc.next();
			
			boolean passwordSet=true;
			while(passwordSet) {
			System.out.print("Enter password: ");
			String password=sc.next();
				char[] arr=password.toCharArray();
				int count=0;
				for(int i=0;i<arr.length;i++) {
					if((arr[i]>='!' && arr[i]<='/') || (arr[i]>=':' && arr[i]<='@') && (arr[i]>='{' && arr[i]<='~')) {
						count=1;
						break;
					}
				}
				if(password.length()>=8 &&count>0) {
					System.out.println("Satisfied....");
					System.out.print("Enter Conform password: ");
					String Conform_password=sc.next();
					if(Conform_password.equals(password)) {
						System.out.println("Password verified...");
						System.out.print("Vaccine true/false:");
						boolean vaccine=sc.nextBoolean();
						if(vaccine) {
							System.out.println("Check robet");
							boolean ruba=true;
							boolean check=true;
							while(check) {
								int random=(int)(Math.random()*9999+9999);
								System.out.println("Random Number: " + random);
								int copyRandom=sc.nextInt();
									if(copyRandom==random) {
										n=new NewUser(name,age,gender,phone,password,Conform_password,vaccine);
										Login.login();
									}else {
										System.out.println("Try again");
										check=true;
										
									}
								}
								
						}else {
							System.out.println("Sorry you cant Travel with us");
							vaccine=false;
						}
					}
					else {
						System.out.println("Incomplete password");
					
					}
				}else {
					System.out.println("Maximum 8 character and atleast one special character");
					passwordSet=true;		
				}
			}
		}
		
	}
}
