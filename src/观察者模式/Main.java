package 观察者模式;

public class Main {
	
	public static void main(String[] args) {
		
		Secretary secretary = new Secretary();
		
		StockObserver yellow = new StockObserver("老王", secretary);
		StockObserver mingXiao = new StockObserver("小明", secretary);
		secretary.attach(yellow);
		secretary.attach(mingXiao);
		
		secretary.subjectStatue = "老板回来了";
		secretary.notifyOb();
		
	}
	
}
