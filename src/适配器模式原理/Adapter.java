package 适配器模式原理;

public class Adapter extends Target{

	private Adaptee adaptee = new Adaptee();
	
	public void request() {
		
		adaptee.specificRequest();
		
	}
	
}
