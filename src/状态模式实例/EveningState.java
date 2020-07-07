package 状态模式实例;

public class EveningState extends State{

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getFinish()) {
			w.setCurrent(new RestState());
			w.writeProgram();
		}else {
			if(w.getHour() < 21) {
				System.out.println("加班");
			}else {
				w.setCurrent(new SleepingState());
				w.writeProgram();
			}
		}
		
	}

}
