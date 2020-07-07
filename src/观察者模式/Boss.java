package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Subject {

	List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	void attach(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	void detach(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	void notifyOb() {
		// TODO Auto-generated method stub
		
	}

}
