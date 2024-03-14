package in.ashokit;

public class RestaurantService {
	
	IPayment bill;
	
	public RestaurantService(IPayment bill) {
	
		this .bill=bill;
	}

	public void collectPayment(double amount) {
		boolean b=bill.billPayment(amount);
		if(b) {
			System.out.println("payment done");
		}
		else
			System.out.println("payment cancelled");
	}
	
}
