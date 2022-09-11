package SingletonDesignPattern;

public class SingletonDesignPattern_ENUM {

	public static void main(String[] args) {

		xyz x = xyz.INSTANCE;
		x.i = 6;
		x.show();
		
		xyz y = xyz.INSTANCE;
		y.i = 7;
		x.show();
	}

}

enum xyz {

	INSTANCE;

	int i;

	public void show() {

		System.out.println(i);
	}

}