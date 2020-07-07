import 抽象工厂模式.part2.IUser;
import 抽象工厂模式.part2.User;

public class SqlserverUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("sqlserver插入一个用户");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
