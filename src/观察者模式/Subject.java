package 观察者模式;

public abstract class Subject {
	
	public String subjectStatue;
	
	abstract void attach(Observer observer);
	abstract void detach(Observer observer);
	abstract void notifyOb();
	
	
}
