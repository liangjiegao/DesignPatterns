package 单例模式.懒汉静态内部类;

public class Singleton {
	
	private static class SingletonHolder{
		
		public static Singleton instance = new Singleton();
		
	} 
	
	public Singleton getInstance() {
		return SingletonHolder.instance;
	}
}
