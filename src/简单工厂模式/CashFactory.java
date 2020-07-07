package 简单工厂模式;

public class CashFactory {

	public static CashSuper createCashAccept(String type) {
		CashSuper cs = null;
		
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
		
		return cs;
	}
	
}
