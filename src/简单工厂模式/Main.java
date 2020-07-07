package 简单工厂模式;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("请输入类型, 普通 normal, 300减100 return, 折扣 rebate");
		CashSuper cs = CashFactory.createCashAccept(sn.next());
		
		if(cs == null) {
			System.out.println("有内鬼，终止交易!");
			return;
		}
		System.out.println("请输入金额：");
		double money = sn.nextDouble();
		double re = cs.acceptCash(money);
		
		System.out.println("优惠后金额： " + re);
	}
	
}
