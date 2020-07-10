package 职责链模式例子;

public class CommonManager extends Manager{

	public CommonManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void requestApplication(Request request) {
		// TODO Auto-generated method stub
		if(request.getType().equals("上厕所")) {
			System.out.println(this.name + ": " + request.getType() + " 允许");
		}else {
			if(superior != null) {
				superior.requestApplication(request);

			}
		}
	}

}
