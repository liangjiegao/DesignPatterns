package 中介模式原理;

public class ConcreteColleague1 extends Colleague{

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void notifyC(String message) {
		System.out.println("c1接收到信息 " + message);
	}
	
}
