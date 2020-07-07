package 状态模式实例;

public class SleepingState extends State{

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		System.out.println("睡着了，不回家了");
	}

}
