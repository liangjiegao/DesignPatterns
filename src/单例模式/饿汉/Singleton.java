package µ¥ÀýÄ£Ê½.¶öºº;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		
	}
	
	public Singleton getInstance() {
		return instance;
	}
	
	
}
