package CGLIBproxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyCGLIBproxy implements MethodInterceptor {

	private Object target;

public Object getInstance(Object target) {
	this.target = target;
	Enhancer enhancer = new Enhancer();
	enhancer.setSuperclass(this.target.getClass());
	enhancer.setCallback(this);
	return enhancer.create();
}
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("cglib proxy");
		Object invokeSuper = methodProxy.invokeSuper(obj, args);
		System.out.println("over");
		return invokeSuper;
	}

}
