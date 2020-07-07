package 建造者模式;

public class Main {
	
	public static void main(String[] args) {
		
		ConcreteBuilder1 b1 = new ConcreteBuilder1();
		Director director = new Director();
		director.construct(b1);
		Product product = b1.getResult();
		product.show();
		
		ConcreteBuilder2 b2 = new ConcreteBuilder2();
		director.construct(b2);
		Product product2 = b2.getResult();
		product2.show();
		
	}
	
}
