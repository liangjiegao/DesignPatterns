package µü´úÆ÷Ä£Ê½;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
	
	List<String> list = new ArrayList<String>();
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}

	@Override
	public void add(String s) {
		// TODO Auto-generated method stub
		list.add(s);
	}
	
	
}
