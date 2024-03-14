package in.Ashokit.Chip;

import org.springframework.stereotype.Service;

@Service
//@Primary
//@Qualifier("Chip64bit")
public class Chip64bit implements Ichip {
	

	public Chip64bit() {
	System.out.println("chip64bit :: constructor");
	}

	@Override
	public void run() {
		System.out.println("chip64bit run");
	}

}
