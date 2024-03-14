package in.BeanScope;

public class Tractor implements IVehicles {

	public Tractor() {
		System.out.println("Tractor class:: constructor");
		
	}

	@Override
	public void start() {
		System.out.println("start the tractor engine ");

	}

	@Override
	public void drive() {
		System.out.println("Drive the tractor and Digging the field");

	}

	@Override
	public void stop() {
		System.out.println("wash the tractor and park at position");

	}

}
