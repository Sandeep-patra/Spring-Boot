package in.Ashokit.Autowiring;

public class ATM {
	private IPrinter printer;
	

	public ATM(IPrinter printer) {
		this.printer=printer;
	}

	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}

	public void withdrow() {
		System.out.println("Money withdrow complited");
		printer.print();
	}

}
