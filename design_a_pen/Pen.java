public abstract class Pen {
    protected String color;
    protected StartStrategy startStrategy;
    protected RefillStrategy refillStrategy;

    public Pen(String color, StartStrategy startStrategy, RefillStrategy refillStrategy) {
        this.color = color;
        this.startStrategy = startStrategy;
        this.refillStrategy = refillStrategy;
    }

    public void start() {
        startStrategy.start();
    }

    public abstract void write();

    public void close() {
        System.out.println("Closing pen");
    }

    public void refill() {
        refillStrategy.refill();
    }
}