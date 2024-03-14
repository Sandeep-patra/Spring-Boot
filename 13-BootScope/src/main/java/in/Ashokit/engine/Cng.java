package in.Ashokit.engine;

public class Cng implements IEngine {
	int cngCapacity;

	@Override
	public void running() {
		System.out.println("Cng engine started");

	}
	public void setCngCapacity( int k) {
		this.cngCapacity=k;
	}
	public int getCngCapacity() {
		return cngCapacity;
	}

}
