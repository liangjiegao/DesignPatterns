package µ¥ÀýÄ£Ê½.ÀÁºº;

public class Singleton {
	
	private static Singleton instance;
	private Object obj;
	private Singleton() {
		
	}
	
	public Singleton getInstance() {
		
		if(instance == null) {
			
			synchronized (obj) {
				
				if(instance == null) {
					return new Singleton();

				}
			
			}
			
		}
		
		return instance;
	}
	
}
