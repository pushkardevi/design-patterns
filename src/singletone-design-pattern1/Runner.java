package SingletonDesignPattern;

public class Runner {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {

			Abc a = Abc.getInstance();
			System.out.println(a.hashCode());

			Abc b = Abc.getInstance();
			System.out.println(b.hashCode());
		});

		Thread t2 = new Thread(() -> {

			Abc a = Abc.getInstance();
		});
		t1.start();
		t2.start();
	}
}
