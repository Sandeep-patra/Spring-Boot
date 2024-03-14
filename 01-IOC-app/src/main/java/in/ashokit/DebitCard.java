package in.ashokit;

public class DebitCard implements IPayment{
	
	public DebitCard() {
		System.out.println("dbit :constructor ");
	}

	public boolean billPayment(double amount) {
		System.out.println("payment through Debit card");
		
		return false;		
	}
}
