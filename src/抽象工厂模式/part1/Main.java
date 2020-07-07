package 抽象工厂模式.part1;

public class Main {
	
	public static void main(String[] args) {
		
		User user = new User();
		
		SqlserverUser su = new SqlserverUser();
		su.insertUser(user);
		
		su.getUser(1);
		
	}
	
}
