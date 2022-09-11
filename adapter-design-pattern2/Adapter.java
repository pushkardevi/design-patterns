package AdapterDesignPattern;

public class Adapter {

    public static void main(String[] args) {

        AndroidCharger androidCharger = new AndroidCharger();
        Android android = new OnePlus();
        androidCharger.charge(android);

        IphoneCharger iphoneCharger = new IphoneCharger();
        Iphone iphone = new IPhone10();
        iphoneCharger.charge(iphone);

        IphoneChargerForAndroid adapter = new IphoneChargerForAndroid(android);
        iphoneCharger.charge(adapter);


    }

}
