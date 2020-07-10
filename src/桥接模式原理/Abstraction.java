package 桥接模式原理;

public abstract class Abstraction {
	
	protected Implementor implementor;

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public abstract void Operation();
	
	
}
