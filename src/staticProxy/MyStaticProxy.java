package staticProxy;

public class MyStaticProxy implements HelloService {

	private HelloService helloService = null;

	public MyStaticProxy(HelloService helloService) {
		super();
		this.helloService = helloService;
	}

	@Override
	public void sayHello(String word) {
		
		System.out.println("MyStaticProxy");
		this.helloService.sayHello(word);
	}
}
