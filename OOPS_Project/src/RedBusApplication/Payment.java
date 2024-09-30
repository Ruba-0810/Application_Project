package RedBusApplication;
import java.util.*;

public class Payment {
	
	static Scanner sc=new Scanner(System.in);
	static Payment p;
	
	public Payment(){
		
	}
	
	public static void pricedetails(int ticketPrice) {
		 try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println("Payment processing was interrupted");
         }
		    System.out.println("Price details");
		    System.out.println("Ticket Price:"+ticketPrice);
		    int tax=2;
		    int taxAmount=ticketPrice+(tax/100);
		    System.out.println("Tax: "+ tax);
		    int gst=5;
		    System.out.println("GST:"+gst);
		    int GSTAmount=taxAmount+gst;
		 try {
			 Thread.sleep(2000);
		 }catch(InterruptedException e) {
			 System.out.println("Payment processing was interrupted");
			 
		 }
		    System.out.println("Enter Total bill:"+ GSTAmount);
		    System.out.println("1.gpay \n2.paytm \n3.UPI \n4.Others");
			System.out.print("Enter your option: ");
			int pay=sc.nextInt();
			switch(pay) {
			case 1:{
				BankingSide.GPayment();
				break;
			}
			case 2:{
				BankingSide.PaytmPayment();
				break;
			}
			case 3:{
				BankingSide.OtherPayment();
				break;
			}
			}
			 
		}
		
	}


