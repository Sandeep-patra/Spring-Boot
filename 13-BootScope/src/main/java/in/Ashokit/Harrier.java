package in.Ashokit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import in.Ashokit.engine.IEngine;

@Service
@Scope("prototype")
public class Harrier implements ICar {
	private IEngine engine;
	
//	@Autowired
	
	public Harrier(IEngine engine) {
		System.out.println("harrier consructor");
		this.engine = engine;
	}

	@Override
	public void start() {
	engine.running();

	}

}
