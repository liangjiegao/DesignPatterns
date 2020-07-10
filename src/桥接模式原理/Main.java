package 桥接模式原理;

public class Main {
	
	public static void main(String[] args) {
		
		Abstraction ab = new RefinedAbstraction();
		ab.setImplementor(new ConcreteImplementorA());
		ab.Operation();
		
		ab.setImplementor(new ConcreteImplementorB());
		ab.Operation();
	}
	
}
