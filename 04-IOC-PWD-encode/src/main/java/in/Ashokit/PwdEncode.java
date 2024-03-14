package in.Ashokit;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdEncode {

	public String encode(String pwd) {
		Encoder encoder = Base64.getEncoder();
		byte[] ps=encoder.encode(pwd.getBytes());
		return new String(ps);
	//	return encoder.encodeToString(pwd.getBytes());
	}
}
