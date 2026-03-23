public class Main {
    public static void main(String[] args) {
        Pen pen = PenFactory.getPen("BALL", "Blue", false);
        pen.start();
        pen.write();
        pen.refill();
        pen.close();
    }
}