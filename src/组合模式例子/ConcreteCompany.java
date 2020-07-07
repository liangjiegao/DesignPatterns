package 组合模式例子;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company{
	
	List<Company> children = new ArrayList<Company>();
	
	public ConcreteCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		for (int i = 0; i < depth; i++) {
			System.out.print('-');
		}
		System.out.println(name);
		for (Company ch : children) {
			ch.display(depth + 2);
		}
	}
	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		for (Company ch : children) {
			ch.lineOfDuty();
		}
	}
	
	
	
}
