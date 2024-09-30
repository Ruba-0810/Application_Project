package RedBusApplication;
import java.util.*;
public class RedBus extends NewUser{
	    private int ticket;
		private String name;
        private String pickUp;
        private String drop;
        private String dropDesicrition;
        private String password;
        private String seat;
        static RedBus[] r;
        
       public RedBus() {
    	   
       }
       public RedBus(int ticket,String name,String pickUp,String drop,String dropDesicrition,String seat) {
    	   this.ticket=ticket;
    	   this.name=name;
    	   this.pickUp=pickUp;
    	   this.drop=drop;
    	   this.dropDesicrition=dropDesicrition;
    	   this.seat=seat;
    	   
       }
       public int getTicket() {
			return ticket;
		}
		public void setTicket(int ticket) {
			this.ticket = ticket;
		}
       public String getName() {
    	   return name;
       }
       public void setName(String name) {
    	   this.name=name;
       }
       public String getpickUp() {
    	   return pickUp;
       }
       public void setpickUp(String pickUp) {
    	   this.pickUp=pickUp;
       }
       public String getdrop() {
    	   return drop;
       }
       public void setdrop(String drop) {
    	   this.drop=drop;
       }
       public String getdropDesicrition() {
    	   return dropDesicrition;
       }
       public void setdropDesicrition(String dropDesicrition) {
    	   this.dropDesicrition=dropDesicrition;
       }
       public String getpassword() {
    	   return password;
       }
       public void setpassword(String password) {
    	   this.password=password;
       }
       public String getSeat() {
			return seat;
		}
		public void setSeat(String seat) {
			this.seat = seat;
		}
		
      
		public String toString() {
    	  return "Ticket no: " +" "+ getTicket() + " " +  " Name: "+" "+ getName()  +" "+ " pickUp: " + " "+ getpickUp()+" "+ " drop: " +" "+ getdrop() +" dropDesicrition: " + getdropDesicrition() +" "+" seat: "+ " "+ getSeat();
        }
		public static void redBus() {
			 if(n.isVaccinated()) {
			    	System.out.print("Enter PickUp point");
			    	String pickup=sc.next();
			    	System.out.print("Enter drop point");
			    	String drop=sc.next();
			    	System.out.print("Enter dropdescination point");
			    	String dropdescination=sc.next();
			    	System.out.print("Enter number of ticket: ");
			    	int ticket=sc.nextInt();
			    	r= new RedBus[ticket]; 
			    	int index=0;
			    	while(index<ticket) {
			    		System.out.print("Enter name: ");
			    		String i=sc.next();
			    		int seat=(int)(Math.random()*5);
			    		
			    		if(seat%2!=0) {
			    			r[index]=new RedBus(index,i,pickup,drop,dropdescination,"Window Seat");
			    		}else {
			    			r[index] =new RedBus(index,i,pickup,drop,dropdescination,"Not window seat");
			    		}
			    		index++;	
			    	}
			    	for(RedBus r1 : r) {
			    		System.out.println(r1);
			    	}
			    	
			    	int ticketPrice=ticket*300;
			    	System.out.println("Payment Process.....");
			    	Payment.pricedetails(ticketPrice);
			    	
			    	
			    }else
			    {
			    	System.out.println("Sorry You dont have Account");
			    }
		}
      
}
