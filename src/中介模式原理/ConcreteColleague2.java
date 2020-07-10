package 中介模式原理;

public class ConcreteColleague2 extends Colleague{

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void notifyC(String message) {
		System.out.println("c2接收到信息 " + message);
	}
}
