package 适配器模式例子;

public class Translator extends Player{

	private ForeignCenter wjzf = new ForeignCenter();
	
	public Translator(String name) {
		super(name);
		wjzf.setName(name);

		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		wjzf.进攻();
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		wjzf.防守();

	}

}
