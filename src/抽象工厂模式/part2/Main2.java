package 抽象工厂模式.part2;

public class Main2 {
	
	public static void main(String[] args) {
		
		User user = new User();
		Department department = new Department();
		try {
			IUser us = DataAccess3.createUser();
			us.insert(user);
			us.getUser(1);
			IDepartment idp = DataAccess3.createDepartment();
			idp.insert(department);
			idp.getDepartment(2);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
