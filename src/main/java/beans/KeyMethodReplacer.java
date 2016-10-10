package beans;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;


public class KeyMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("I can open it without key!");
		return null;
	}

}
