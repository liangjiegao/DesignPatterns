package 原型模式;

public class Resume implements Cloneable{
	
	private String name;
	private String sex;
	private String age;
	
	private WorkExperience work;
	
	public Resume(String name) {
		this.name = name;
		
		this.work = new WorkExperience();
	}
	public Resume(WorkExperience workExperience) throws CloneNotSupportedException {
		
		this.work = (WorkExperience) workExperience.clone();
	}
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String workDate, String company) {
		this.work.setWorkDate(workDate);
		this.work.setCompany(company);
	}
	
	public void display() {
		System.out.printf("name: %s, age: %s, sex: %s\n", this.name, this.age, this.sex);
		System.out.printf("workDate: %s, company: %s\n", this.work.getWorkDate(), this.work.getCompany());
	}
	
	public Object clone() throws CloneNotSupportedException {
		Resume resume = new Resume(this.work);
		resume.name = this.name;
		resume.age = this.age;
		resume.sex = this.sex;
		
		return resume;
	}
}
