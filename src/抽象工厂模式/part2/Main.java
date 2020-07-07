package 抽象工厂模式.part2;

public class Main {
	
	public static void main(String[] args) {
		
		User user = new User();
		IFactory factory = new SqlserverFactory();
		IUser us = factory.createUser();
		us.insert(user);
		us.getUser(1);
		
		Department department = new Department();
		IDepartment dp = factory.createDepartment();
		dp.insert(department);
		dp.getDepartment(1);
		
	}
	
}
