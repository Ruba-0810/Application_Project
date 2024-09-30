package Product;

public class Driver {
 
	public static void main(String[] args) {
		
		Product p1=new Product(1,"laptop",45000);
		Product p2=new Product(2,"watch",50000);
		Product p3=new Product(3,"mobile",60000);
		Product p4=new Product(4,"Apple",70000);
		
		Product[] arr= {p1,p2,p3,p4};
		double largest=Integer.MIN_VALUE;
		for(Product i : arr) {
			if(i.getPrice()>largest) {
				largest=i.getPrice();
			}
		}
		System.out.println(largest);
		
		
	}
}
