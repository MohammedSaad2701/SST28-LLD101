import java.util.List;

public class NearestElevatorStrategy implements ElevatorStrategy {
    public Elevator selectElevator(Request request, List<Elevator> elevators) {
        Elevator best = null;
        int minDistance = Integer.MAX_VALUE;

        for (Elevator e : elevators) {
            int distance = Math.abs(e.getCurrentFloor() - request.getSourceFloor());
            if (distance < minDistance) {
                minDistance = distance;
                best = e;
            }
        }
        return best;
    }
}