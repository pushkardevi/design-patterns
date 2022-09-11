package AdapterDesignPattern;

public class IphoneChargerForAndroid implements Iphone {

    private Android android;

    IphoneChargerForAndroid(Android android) {
        this.android = android;

    }

    @Override
    public void charge() {
        android.charge();
    }
}
