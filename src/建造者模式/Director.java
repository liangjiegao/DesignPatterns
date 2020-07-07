package 建造者模式;

public class Director {
	
	public void construct(Builder builder) {
		
		builder.buildPartA();
		builder.buildPartB();
		
	}
	
}
