public class BallPen extends Pen {
    public BallPen(String color, StartStrategy startStrategy, RefillStrategy refillStrategy) {
        super(color, startStrategy, refillStrategy);
    }

    public void write() {
        System.out.println("Writing with BallPen in " + color);
    }
}