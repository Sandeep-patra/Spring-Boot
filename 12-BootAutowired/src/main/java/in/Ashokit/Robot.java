package in.Ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import in.Ashokit.Chip.Ichip;

@Component

public class Robot {
	@Autowired
	@Qualifier("chip32bit")
	private Ichip chip;
	//@Autowired
	
//	public Robot(Ichip chip) {
//		System.out.println("Robot :: constructor");
//	this.chip = chip;
//	}
	
	public void function() {
		System.out.println(chip.getClass().getName());
		chip.run();
	}


}
