package AdapterDesignPattern2;

public class School {

    public static void main(String[] args) {

        //PilotPen pp = new PilotPen();
        Pen adapter = new PenAdapter();
        Assignment assignment = new Assignment();
        assignment.setPen(adapter);
        assignment.writeAssignment("I am tired");
    }
}
