package application;

import beans.LockOpener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test Application class
 */
public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		/* TESTING METHOD LOOKUP */
		LockOpener unlocker = context.getBean("unlocker", LockOpener.class);
		for (int i = 0; i < 5; i++) {
			unlocker.open();
		}

		/* TESTING METHOD REPLACEMENT */
		unlocker = context.getBean("hackedUnlocker", LockOpener.class);
		unlocker.open();
	}

}
