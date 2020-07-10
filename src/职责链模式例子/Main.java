package 职责链模式例子;

public class Main {
	
	public static void main(String[] args) {
		
		Manager cm = new CommonManager("黄经理");
		Manager md = new Majordomo("朱总监");
		Manager gm = new GeneralManager("刘总经理");
		cm.setSuperior(md);
		md.setSuperior(gm);
		
		Request request = new Request();
		request.setType("上厕所");
		cm.requestApplication(request);
		
		request.setType("请假");
		cm.requestApplication(request);
		
		request.setType("加薪");
		request.setCount(500);
		cm.requestApplication(request);
		
		request.setCount(2000);
		cm.requestApplication(request);
	}
	
}
