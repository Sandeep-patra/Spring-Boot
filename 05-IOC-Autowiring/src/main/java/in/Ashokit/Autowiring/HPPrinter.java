package in.Ashokit.Autowiring;

public class HPPrinter implements IPrinter {
	
	

	public HPPrinter() {
		System.out.println("Hp constructor called");
	}

	@Override
	public void print() {
		System.out.println("printed through Hp printer");

	}

}
