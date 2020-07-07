package 代理模式例子;

public class Pursuit implements IGiveGift{
	
	SchoolGirl sg;
	
	public Pursuit(SchoolGirl sg) {
		
		this.sg = sg;
		
	}

	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println(sg.getName() + " 送你洋娃娃！");
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(sg.getName() + " 送你花！");
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(sg.getName() + " 送你巧克力！");
	}
	
}
