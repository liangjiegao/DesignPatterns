package 装饰模式例子;

public class Main {
	
	public static void main(String[] args) {
		
		Person p = new Person("小黄");
		
		BigTrouser b = new BigTrouser();
		TShirts t = new TShirts();
		
		b.Decorate(p);
		t.Decorate(b);
		
		t.show();
		
	}
	
}
