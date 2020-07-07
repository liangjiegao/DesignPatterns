package 适配器模式例子;

public class Forwards extends Player{

	public Forwards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(name + "进攻");

	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println(name + "防守");

	}
	
	
	
}
