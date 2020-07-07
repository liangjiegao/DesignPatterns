package 简单工厂模式;

public class CashNormal extends CashSuper{

	@Override
	public double acceptCash(double money) {
		
		return money;
	}
	
	
	
}
