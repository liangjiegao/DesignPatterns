package 状态模式实例;

public class ForenoonState extends State{

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour() < 12) {
			System.out.println("上午");
		}else {
			w.setCurrent(new NoonState());
			w.writeProgram();
		}
	}
	
	
	
}
