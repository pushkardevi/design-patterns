package SingletonDesignPattern;

public class Demo1 {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getObject();
        System.out.println(s1.hashCode());
        Singleton s2 = Singleton.getObject();
        System.out.println(s2.hashCode());

    }

    private static class Singleton{

        private static Singleton singleton;

        private Singleton(){

        }

        private static Singleton getObject(){
            if(singleton == null){
                singleton = new Singleton();
                return singleton;
            }
            return singleton;
        }

    }

}
