package 抽象工厂模式.part2;

public class AccessDepartment implements IDepartment{

	@Override
	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("access插入一个部门");
	}


	@Override
	public User getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("获取id为" + id + "的部门");

		return null;
	}

}
