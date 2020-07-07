package 模板方法模式例子;

public abstract class TestPaper {
	
	public void testQuestion1() {
		System.out.println("问题1");
		System.out.println("答案：" + this.answer1());
	}
	
	public void testQuestion2() {
		System.out.println("问题2");
		System.out.println("答案：" + this.answer2());
	}
	
	public void testQuestion3() {
		System.out.println("问题3");
		System.out.println("答案：" + this.answer3());
	}
	
	public abstract String answer1();
	
	public abstract String answer2();

	public abstract String answer3();

}
