package 工厂方法模式原理;

public class SubFactory implements IFactory{

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new SubOperation();
	}

}
