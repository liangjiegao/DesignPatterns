package 策略模式;

import 策略模式.CashNormal;
import 策略模式.CashRebate;
import 策略模式.CashReturn;

public class CashContext {
	
	private CashSuper cs = null;
	
	public CashContext(String type) {
		switch(type) {
			case "normal":
				cs = new CashNormal();
				break;
			case "return":
				cs = new CashReturn("300", "100");
				break;
			case "rebate":
				cs = new CashRebate("0.8");
				break;
		}
		
	}
	public double getResult(double money) {
		if(cs == null) {
			return -1.0;
		}
		return cs.acceptCash(money);
	}
}
