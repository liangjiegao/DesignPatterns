package 组合模式例子;

public class HRDepartment extends Company{

	public HRDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		for (int i = 0; i < depth; i++) {
			System.out.print('-');
		}
		System.out.println(name);
	}

	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		System.out.println(name + "负责招聘");
	}

}
