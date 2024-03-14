package in.BeanScope;

public class Car implements IVehicles {

	public Car() {
		
		System.out.println("Car class::constructor");
	}

	public void start() {
		System.out.println("put the key in hole and start the car engine");
	}

	@Override
	public void drive() {
		System.out.println("put the gear and drive Slow");
		
	}

	@Override
	public void stop() {
		System.out.println("park the car and stop the engine");
		
	}
}
