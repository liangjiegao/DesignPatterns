package 建造者模式;

public interface Builder {
	
	public void buildPartA();
	public void buildPartB();

	public Product getResult();
	
}
