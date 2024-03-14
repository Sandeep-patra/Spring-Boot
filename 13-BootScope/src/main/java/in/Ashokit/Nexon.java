package in.Ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.Ashokit.engine.IEngine;

@Service
public class Nexon implements ICar {
 private IEngine engine;
 
@Autowired
public void setEngine(@Qualifier("diesel") IEngine engine) {
	this.engine = engine;
}

	@Override
	public void start() {
		
		engine.running();
	}

}
