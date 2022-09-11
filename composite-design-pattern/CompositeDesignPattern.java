package CompositeDesignPattern;

public class CompositeDesignPattern {

	public static void main(String[] args) {

		
		Compositor c1 = new Compositor("Monitor");
		Compositor c5 = new Compositor("Ram");
		
		c1.addAccessories(c5);
		c1.showPrice();
		
	}
	
}
