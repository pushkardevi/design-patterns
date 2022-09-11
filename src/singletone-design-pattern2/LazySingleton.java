package Singleton2;

public class LazySingleton {

    private LazySingleton(){

    }

    private static LazySingleton instance;

    private static synchronized LazySingleton getInstance(){
        if(instance == null){
            return instance = new LazySingleton();
        }
        else {
            return instance;
        }
    }

    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance().hashCode());
        System.out.println(LazySingleton.getInstance().hashCode());
    }
}
