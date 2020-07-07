package 观察者模式;

public class StockObserver extends Observer{

	public StockObserver(String name, Subject subject) {
		super(name, subject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s 关闭股票了继续工作。\n", subject.subjectStatue, name);
	}

}
