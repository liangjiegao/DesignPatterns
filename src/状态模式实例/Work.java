package ״̬ģʽʵ��;

public class Work {
	
	private State current;
	private boolean finish;
	private double hour;
	
	public Work() {
		this.current = new ForenoonState(); 
	}

	public State getCurrent() {
		return current;
	}

	public void setCurrent(State current) {
		this.current = current;
	}

	public boolean getFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public void writeProgram() {
		current.writeProgram(this);
	}
	
}
