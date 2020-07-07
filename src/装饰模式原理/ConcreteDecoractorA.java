package 装饰模式原理;

public class ConcreteDecoractorA extends Decorator{

	private String addedState;
	
	@Override
	public void Operation() {
		
		super.Operation();
		addedState = "New State";
		System.out.println("具体装饰器A");
		
	}
	
}
