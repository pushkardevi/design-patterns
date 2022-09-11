package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Compositor implements Accessories {

	String name;
	List<Accessories> list = new ArrayList<>();
	
	
	public Compositor(String name) {
		this.name = name;
	}
	
	void addAccessories(Accessories accessories) {
		list.add(accessories);
	}
	
	
	@Override
	public void showPrice() {
	
		
		System.out.println(name);
		
		for(Accessories acc : list) {
			acc.showPrice();
		}
	}
}

