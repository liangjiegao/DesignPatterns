package 状态模式实例;

public class AftennoonState extends State{

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour() < 17) {
			System.out.println("下午");
		}else {
			w.setCurrent(new EveningState());
			w.writeProgram();
		}
	}

}
