package Prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {

		BookShop bs = new BookShop();
		bs.setShopName("Novelty");
		bs.loadData();

		

		BookShop bs1 = bs.clone();
		bs.getBooks().remove(2);
		bs1.setShopName("RSA");
		
		System.out.println(bs);
		System.out.println(bs1);
		
		
		BookShop bs2 = bs1.clone();
		bs2.setShopName("Royal");
		bs1.getBooks().remove(1);
		System.out.println(bs1);
		System.out.println(bs2);

	}
}
