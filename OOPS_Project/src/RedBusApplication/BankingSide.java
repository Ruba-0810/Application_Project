package RedBusApplication;
import java.util.*;

public class BankingSide{
	  static  Scanner sc=new Scanner(System.in);
	   BankingSide b1;
	   static int PIN ;
	   static String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    static String randomword=randomValue(6);
	    static boolean flag=true;
	   public static void GPayment() {
			   System.out.println("Random number:" +randomword);
				 String r1=sc.next();
				 if( randomword.equals(r1)) {
					 PIN=sc.nextInt();
					 System.out.print("Enter the PIN number:");
			   	     int enterPin=sc.nextInt();
			   	        if(enterPin==PIN) {
			   		      System.out.println("Processing payment.....");
			   		   try {
			               Thread.sleep(1000);
			           } 
			   		   catch (InterruptedException e) {
			               System.out.println("Payment processing was interrupted");
			           }
			   		   System.out.println("Payed Sucessfully");
			   		   Exit.exit();
			   	         }else {
			   	        	 System.out.println("Wrong password");
			   	        	 GPayment();
			   	         }
				    }
				 else {
					 System.out.println("Incomplete caption");
					 GPayment();
				 }
			   
		   }
	   
	  
	   public static void PaytmPayment() {
			 System.out.println("Random number:" + randomword);
			 String r1=sc.next();
			 if( randomword.equals(r1)) {
				 	 PIN=sc.nextInt();
				 System.out.print("Enter the PIN number:");
		   	     int enterPin=sc.nextInt();
		   	        if(enterPin==PIN) {
		   		      System.out.println("Processing payment.....");
		   		   try {
		               Thread.sleep(1000);
		           } 
		   		   catch (InterruptedException e) {
		               System.out.println("Payment processing was interrupted");
		           }
		   		   System.out.println("Payed Sucessfully");
		   		 Exit.exit();
		   		 
		   	         }else {
		   	        	 System.out.println("Wrong password");
		   	        	 PaytmPayment();
		   	        	 
		   	         }
			    }
			 else {
				 System.out.println("Incomplete caption");
				 PaytmPayment();
			 }
		   }
			
	 public static void OtherPayment() {
		 System.out.println("Random number:" + randomword);
		 String r1=sc.next();
		 if( randomword.equals(r1)) {
			 PIN=sc.nextInt();
			 System.out.print("Enter the PIN number:");
	   	     int enterPin=sc.nextInt();
	   	        if(enterPin==PIN) {
	   		      System.out.println("Processing payment.....");
	   		   try {
	               Thread.sleep(1000);
	           } 
	   		   catch (InterruptedException e) {
	               System.out.println("Payment processing was interrupted");
	           }
	   		   System.out.println("Payed Sucessfully");
	   		 Exit.exit();
	   		 flag=false;
	   	         }else {
	   	        	 System.out.println("Wrong password");
	   	        	 OtherPayment() ;
	   	         }
		    }
		 else {
			 System.out.println("Incomplete caption");
			 OtherPayment() ;
		 }
		 }
	 public static String randomValue(int length) {
		   StringBuilder str=new StringBuilder();
		   Random random = new Random();
		   for(int i=0;i<length;i++) {
			  char ans=characters.charAt(random.nextInt(characters.length()));
			  str.append(ans);
		   }
		  return str.toString();
	   }
}
