package 职责链模式例子;

public abstract class Manager {
	
	protected String name;
	protected Manager superior;
	
	public Manager(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void setSuperior(Manager superior) {
		this.superior = superior;
	}
	
	public abstract void requestApplication(Request request);
	
}
