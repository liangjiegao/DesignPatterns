package 代理模式原理;

public class RealSubject implements Subject{

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("真实的请求");
	}
	
}
