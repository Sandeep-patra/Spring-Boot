package in.Ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumberService {
	private ArmStrong arm;
	
	public NumberService() {
		super();
	}
	@Autowired
	public NumberService(ArmStrong arm) {
		this.arm=arm;
	}
	public void isArmstrong(int n) {
		boolean ch = arm.CheckArmStrong(n);
		if(ch)
			System.out.println("it is a ArmStrong number");
		else
			System.out.println("it is not a Armstrong Number");
	}
}
