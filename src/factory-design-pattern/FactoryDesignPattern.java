package FactoryDesignPattern;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		
		OsFactory factory = new OsFactory();
		OS os = factory.getInstance("IOS");
		os.specifications();
		
	}

}
