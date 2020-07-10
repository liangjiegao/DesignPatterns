package 职责链模式原理;

public class ConcreteHandler3 extends Handler{

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request < 30) {
			System.out.println(this.getClass().getName() + "处理请求" + request);
		}else {
			System.out.println("无法解决");
		}
	}

}
