package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloServiceProxy implements InvocationHandler {
	private Object target;

	public Object bind(Object target) {
		this.target = target;
		Object newProxyInstance = Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this);
		return newProxyInstance;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("befer test");
		Object result = method.invoke(target, args);
		System.out.println("after test");
		return result;
	}

}
