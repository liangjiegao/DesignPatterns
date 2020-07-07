package 组合模式例子;

public class Main {
	
	public static void main(String[] args) {
		
		ConcreteCompany root = new ConcreteCompany("深圳总公司");
		root.add(new HRDepartment("总部人力资源部"));
		root.add(new FinanceDepartment("总部财政部"));
		
		ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
		comp.add(new HRDepartment("华东人力资源部"));
		comp.add(new FinanceDepartment("华东财政部"));
		
		root.add(comp);
		
		ConcreteCompany comp2 = new ConcreteCompany("南京办事处");
		comp2.add(new HRDepartment("南京人力资源部"));
		comp2.add(new FinanceDepartment("南京财政部"));
		
		comp.add(comp2);
		
		ConcreteCompany comp3 = new ConcreteCompany("杭州办事处");
		comp3.add(new HRDepartment("杭州人力资源部"));
		comp3.add(new FinanceDepartment("杭州财政部"));
		
		comp.add(comp3);
		System.out.println("结构图：");
		root.display(1);
		System.out.println("职责：");
		root.lineOfDuty();

	}
	
}
