package in.ashokit;

public class CreditCard implements IPayment {

	@Override
	public boolean billPayment(double amount) {
		System.out.println("payment through Credit Card");
		return true;
	}

}
