package staticProxy;

public class HelloServiceImp implements HelloService {

	@Override
	public void sayHello(String word) {
		System.out.println("hello " + word);
	}
}
