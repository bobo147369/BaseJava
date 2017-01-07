package CGLIBproxy;

import org.junit.Test;

public class ProxyTest {
	@Test
	public void test() {
		MyCGLIBproxy myCGLIBproxy = new MyCGLIBproxy();
		HelloService helloService = (HelloService) myCGLIBproxy.getInstance(new HelloServiceImp());
		helloService.sayHello("wangBo");
	}
}
