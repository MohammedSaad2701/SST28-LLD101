public class GelPen extends Pen {
    public GelPen(String color, StartStrategy startStrategy, RefillStrategy refillStrategy) {
        super(color, startStrategy, refillStrategy);
    }

    public void write() {
        System.out.println("Writing with GelPen in " + color);
    }
}