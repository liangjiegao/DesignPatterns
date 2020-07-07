package 建造者模式;

public class ConcreteBuilder1 implements Builder{
	Product product = new Product();
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("部件A");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("部件B");

	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}
	
	
	
}
