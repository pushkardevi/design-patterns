package AdapterDesignPattern2;

public class PenAdapter implements Pen {

    @Override
    public void write(String str) {
        PilotPen pp = new PilotPen();
        pp.write(str);
    }
}
