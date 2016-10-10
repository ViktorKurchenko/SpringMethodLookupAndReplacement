package beans;

import java.util.Random;

public class KeyProvider implements Key {

	@Override
	public void open() {
		System.out.println("Trying to open ... " + new Random().nextBoolean());
	}

}
