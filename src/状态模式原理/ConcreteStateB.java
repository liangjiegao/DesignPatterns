package 状态模式原理;

public class ConcreteStateB extends State{

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("从状态B变为状态C");
		context.setState(new ConcreteStateC());
	}

}
