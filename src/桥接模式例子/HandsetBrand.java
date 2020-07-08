package 桥接模式例子;

public abstract class HandsetBrand {

	protected HandsetSoft soft;
	
	public void setHandsetSoft(HandsetSoft soft) {
		this.soft = soft;
	}
	
	public abstract void run();
	
}
