package jdkProxy;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void test() {
		HelloServiceProxy helloServiceProxy = new HelloServiceProxy();
		HelloService helloService = (HelloService) helloServiceProxy.bind(new HelloServiceImp());
		helloService.sayHello("wangbo");
	}

}
