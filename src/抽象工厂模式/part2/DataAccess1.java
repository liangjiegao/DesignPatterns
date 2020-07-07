package 抽象工厂模式.part2;

public class DataAccess1 {
	
	private static String db = "Sqlserver";
//	private static String db = "Access";
	
	public static IUser createUser() {
		
		IUser user = null;
		
		switch (db) {
		case "Sqlserver":
			user = new SqlserverUser();
			break;
		case "Access":
			user = new AccessUser();
			break;
		default:
			break;
		}
		
		return user;
	}
	public static IDepartment createDepartment() {
		
		IDepartment department = null;
		
		switch (db) {
		case "Sqlserver":
			department = new SqlserverDepartment();
			break;
		case "Access":
			department = new AccessDepartment();
			break;
		default:
			break;
		}
		
		return department;
	}
}
