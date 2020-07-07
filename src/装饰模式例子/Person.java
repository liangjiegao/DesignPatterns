package 装饰模式例子;

public class Person {
	
	public Person() {}
	
	
	private String name;
	
	
	public Person(String name) {
		
		this.name = name;
		
	}
	
	public void show() {
		
		System.out.printf("装扮的%s\n", name);
		
	}
	
}
