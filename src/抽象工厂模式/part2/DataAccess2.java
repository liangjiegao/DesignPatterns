package 抽象工厂模式.part2;

public class DataAccess2 {
	
	private static String db = "Sqlserver";
//	private static String db = "Access";
	
	public static IUser createUser() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		IUser user = (IUser) Class.forName(db + "User").newInstance();
		
		return user;
	}
	
	public static IDepartment createDepartment() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		IDepartment department = (IDepartment) Class.forName(db + "Department").newInstance();
		
		return department;
	}
}
