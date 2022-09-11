package Singleton2;

public class DoubleCheckingSingleton {

    private DoubleCheckingSingleton() {

    }

    private static DoubleCheckingSingleton instance;

    private static DoubleCheckingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckingSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(DoubleCheckingSingleton.getInstance().hashCode());
        System.out.println(DoubleCheckingSingleton.getInstance().hashCode());
    }

}
