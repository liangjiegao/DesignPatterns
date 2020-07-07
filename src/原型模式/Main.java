package 原型模式;

public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Resume resumeOrg = new Resume("梁杰高");
		resumeOrg.setPersonalInfo("男", "22");
		resumeOrg.setWorkExperience("2019-7-19 至 2020-6-25", "广州秀才信息科技有限公司");
		
		Resume resumeCopy = (Resume) resumeOrg.clone();
		resumeCopy.setPersonalInfo("女", "23");
		resumeCopy.setWorkExperience("2020-11-10 至 至今", "腾讯");
		
		resumeOrg.display();
		resumeCopy.display();
	}
	
}
