package 职责链模式原理;

public class Main {

	public static void main(String[] args) {
		
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();

		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		int[] request = {3, 8, 10, 11, 18, 22, 55, 99};
		
		for (int i = 0; i < request.length; i++) {
			
			h1.handleRequest(request[i]);
			
		}
	}
	
}
