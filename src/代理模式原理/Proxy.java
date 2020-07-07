package 代理模式原理;

public class Proxy implements Subject{

	RealSubject realSubject;
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		if(realSubject == null) {
			
			realSubject = new RealSubject();
			
		}
		System.out.println("代理调用真实");
		realSubject.request();
	}

}
