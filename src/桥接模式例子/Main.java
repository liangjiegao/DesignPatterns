package 桥接模式例子;

public class Main {
	
	public static void main(String[] args) {
		
		HandsetBrand ab;
		
		ab = new HandsetBrandN();
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();
		
		ab = new HandsetBrandM();
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();
		
		
	}
	
}
