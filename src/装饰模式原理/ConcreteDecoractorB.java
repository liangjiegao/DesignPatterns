package 装饰模式原理;

public class ConcreteDecoractorB extends Decorator{

	
	@Override
	public void Operation() {
		
		super.Operation();
		this.addedBehavior();
		System.out.println("具体装饰器B");
		
	}
	
	private void addedBehavior() {
		
	}
	
}
