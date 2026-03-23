public class PenFactory {
    public static Pen getPen(String type, String color, boolean withCap) {
        StartStrategy startStrategy = withCap ? new CapStart() : new ClickStart();
        RefillStrategy refillStrategy = type.equalsIgnoreCase("INK") ? new InkRefill() : new CartridgeRefill();

        switch (type.toUpperCase()) {
            case "BALL": return new BallPen(color, startStrategy, refillStrategy);
            case "GEL": return new GelPen(color, startStrategy, refillStrategy);
            case "INK": return new InkPen(color, startStrategy, refillStrategy);
            default: throw new IllegalArgumentException("Invalid pen type");
        }
    }
}