package 适配器模式例子;

public class Main {
	
	public static void main(String[] args) {
		
		Player b = new Forwards("巴蒂尔");
		b.attack();
		
		Player m = new Guards("麦克格雷迪");
		m.attack();
		
//		Player ym = new Center("姚明");
//		ym.attack();		// 实际上一开始姚明是听不懂是啥的
//		ym.defense();
		
		Player ym = new Translator("姚明");	// 请了翻译才知道 attact是进攻，defense是防守
		ym.attack();
		ym.defense();
	}
	
}
