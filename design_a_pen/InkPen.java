public class InkPen extends Pen {
    public InkPen(String color, StartStrategy startStrategy, RefillStrategy refillStrategy) {
        super(color, startStrategy, refillStrategy);
    }

    public void write() {
        System.out.println("Writing with InkPen in " + color);
    }
}