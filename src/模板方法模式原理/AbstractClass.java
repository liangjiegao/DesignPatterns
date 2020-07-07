package 模板方法模式原理;

public abstract class AbstractClass {
	
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	public void templateMethod() {
		
		this.primitiveOperation1();
		this.primitiveOperation2();
		System.out.println("");
		
	}
	
}
