package 装饰模式例子;

public class Finery extends Person{
	
	protected Person component;
	
	public void Decorate(Person component) {
		
		this.component = component;
		
	}

	public void show() {
		
		if(component != null) {
			
			component.show();
			
		}
		
	}
	
}
