package in.Ashokit.Autowiring;

public class SonyPrinter implements IPrinter{
	
	

	public SonyPrinter() {
		System.out.println("Sony constructor called");
	}

	@Override
	public void print() {
		System.out.println("printed through Sony printer");
		
	}

}
