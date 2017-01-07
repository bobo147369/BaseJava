package staticProxy;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void test() {
		MyStaticProxy myStaticProxy = new MyStaticProxy(new HelloServiceImp());
		myStaticProxy.sayHello("wangbo");
	}
}
