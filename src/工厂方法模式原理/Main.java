package 工厂方法模式原理;

public class Main {
	
	public static void main(String[] args) {
		
		IFactory factory = new AddFactory();
		Operation op = factory.createOperation();
		op.setNum1(10);
		op.setNum2(20);
		System.out.println(op.getResult());
	}
	
}
