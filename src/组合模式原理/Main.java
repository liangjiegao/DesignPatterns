package 组合模式原理;

public class Main {
	
	public static void main(String[] args) {
		
		Component root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));

		Component comp = new Composite("Composite X");
		comp.add(new Leaf("Composite XA"));
		comp.add(new Leaf("Composite XB"));
		
		root.add(comp);
		
		Component comp2 = new Composite("Composite XY");
		comp2.add(new Leaf("Composite XYA"));
		comp2.add(new Leaf("Composite XYB"));
		
		root.add(comp2);
		
		root.add(new Leaf("Leaf C"));
		
		Leaf d = new Leaf("Leaf D");
		root.add(d);
		root.remove(d);

		root.display(1);
		
	}
	
}
