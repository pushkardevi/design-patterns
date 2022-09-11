package SingletonDesignPattern;

public class Abc {

    // static Abc a = new Abc(); // Eager Loading
    public static Abc a; // Lazy Loading

    private Abc() {
        System.out.println("Created");
    }

    public static Abc getInstance() { // synchronized

        if (a == null) {

            synchronized (Abc.class) { // Double checked Locking // problem deserilization
                if (a == null) {
                    a = new Abc();
                }
            }
        }
        return a;
    }

}