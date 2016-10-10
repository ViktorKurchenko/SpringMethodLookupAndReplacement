package beans;

public abstract class AbstractLockOpenerImpl implements LockOpener {

	@Override
	public void open() {
		getKey().open();
	}

}
