package 模板方法模式例子;

public class Main {
	
	public static void main(String[] args) {
		
		TestPaper paper;
		System.out.println("A学生的试卷答案");
		paper = new TestPaperA();
		paper.testQuestion1();
		paper.testQuestion2();
		paper.testQuestion3();

		System.out.println("B学生的试卷答案");
		paper = new TestPaperB();
		paper.testQuestion1();
		paper.testQuestion2();
		paper.testQuestion3();
	}
	
}
