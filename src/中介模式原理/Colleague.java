package 中介模式原理;

public abstract class Colleague {

	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		// TODO Auto-generated constructor stub
		this.mediator = mediator;
	}
	
}
