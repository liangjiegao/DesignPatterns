package 模板方法模式原理;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractClass classA = new ConcreteClassA();
		classA.templateMethod();
		
		AbstractClass classB = new ConcreteClassB();
		classB.templateMethod();
	}
	
}
