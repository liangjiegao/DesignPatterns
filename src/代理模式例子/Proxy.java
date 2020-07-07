package 代理模式例子;

public class Proxy implements IGiveGift{
	
	Pursuit pursuit;
	
	public Proxy(SchoolGirl sg) {
		this.pursuit = new Pursuit(sg);
	}
	
	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		pursuit.giveDolls();
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		pursuit.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		pursuit.giveChocolate();

	}

}
