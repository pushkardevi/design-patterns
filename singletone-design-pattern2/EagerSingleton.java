package Singleton2;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private static EagerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(EagerSingleton.getInstance().hashCode());
        System.out.println(EagerSingleton.getInstance().hashCode());
    }

}
