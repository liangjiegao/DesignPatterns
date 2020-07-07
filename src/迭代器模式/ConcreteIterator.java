package µü´úÆ÷Ä£Ê½;

public class ConcreteIterator extends Iterator{
	
	private ConcreteAggregate aggregate;
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		// TODO Auto-generated constructor stub
		this.aggregate = aggregate;
	}
	
	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return aggregate.list.get(0);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if(isDone()) {
			return null;
		}
		return aggregate.list.get(++current);
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current + 1 >= aggregate.list.size();
	}

	@Override
	public Object curentItem() {
		// TODO Auto-generated method stub
		return aggregate.list.get(current);
	}
	
	
	
}
