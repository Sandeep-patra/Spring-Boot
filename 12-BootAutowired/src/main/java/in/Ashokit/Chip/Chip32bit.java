package in.Ashokit.Chip;

import org.springframework.stereotype.Service;

@Service
//@Qualifier("Chip32bit")
public class Chip32bit implements Ichip {
	

	public Chip32bit() {
		System.out.println("chip32bit :: constructor");
	}

	@Override
	public void run() {
		System.out.println("chip32bit run");

	}

}
