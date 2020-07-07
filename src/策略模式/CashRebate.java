package ²ßÂÔÄ£Ê½;

public class CashRebate extends CashSuper{
	
	private double moneyRebate = 1d;
	public CashRebate(String rebate) {
		
		this.moneyRebate = Double.parseDouble(rebate);
		
	}
	
	
	@Override
	public double acceptCash(double money) {
		
		return money * moneyRebate;
	}

}
