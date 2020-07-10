package 桥接模式原理;

public class RefinedAbstraction extends Abstraction{

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		implementor.operation();
	}

}
