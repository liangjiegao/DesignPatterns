package 职责链模式例子;

public class GeneralManager extends Manager{

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void requestApplication(Request request) {
		// TODO Auto-generated method stub
		if(request.getType().equals("加薪") && request.getCount() < 1000) {
			System.out.println(this.name + ": " + request.getType() + request.getCount() + " 拿去花");
		}else {
			System.out.println(this.name + ": " + request.getType() + request.getCount() + " 加个锤子");
		}
	}

}
