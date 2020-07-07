package ²ßÂÔÄ£Ê½;

public class CashReturn extends CashSuper{

	private double moneyCondition 	= 0.0d;
	private double moneyReturn 		= 0.0d;
	
	public CashReturn(String condition, String mReturn) {
		this.moneyCondition = Double.parseDouble(condition);
		this.moneyReturn	= Double.parseDouble(mReturn);;
	}
	
	@Override
	public double acceptCash(double money) {
		
		if(money >= moneyCondition) {
			return money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		
		return 0;
	}

}
