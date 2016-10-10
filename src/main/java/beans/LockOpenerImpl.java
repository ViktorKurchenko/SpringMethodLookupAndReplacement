package beans;

public class LockOpenerImpl implements LockOpener {

	@Override
	public void open() {
		getKey().open();
	}

	@Override
	public Key getKey() {
		return () -> System.out.println("Try open ... can't open!");
	}

}
