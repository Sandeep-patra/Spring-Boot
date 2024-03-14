package in.Ashokit;

import org.springframework.stereotype.Service;

@Service
public class ArmStrong {
	public boolean CheckArmStrong(int n) {
		int c,sum=0,n1=n;
		String nString = Integer.toString(n);
		int length = nString.length();
		
		while(n!=0) {
			c=n%10;
			sum+=(int)Math.pow(c, length);
			n/=10;
		}
		if(n1==sum)
		return true;
		
		return false;
		
	}
}
