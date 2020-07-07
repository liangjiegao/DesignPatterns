package 状态模式原理;

public class ConcreteStateC extends State{

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("从状态C变为状态A");
		context.setState(new ConcreteStateA());
	}

}
