package 状态模式原理;

public class ConcreteStateA extends State{

	@Override
	public void handle(Context context) {
		System.out.println("从状态A变为状态B");
		context.setState(new ConcreteStateB());
		
	}
	
	
	
}
