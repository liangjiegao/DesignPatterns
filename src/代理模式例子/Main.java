package 代理模式例子;

public class Main {
	
	public static void main(String[] args) {
		SchoolGirl sg = new SchoolGirl();
		sg.setName("大屌萌妹");
		
		Proxy proxy = new Proxy(sg);
		
		proxy.giveDolls();
		proxy.giveFlowers();
		proxy.giveChocolate();
	}
	
}
