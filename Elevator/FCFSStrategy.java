import java.util.List;

public class FCFSStrategy implements ElevatorStrategy {
    public Elevator selectElevator(Request request, List<Elevator> elevators) {
        return elevators.get(0); // simple logic
    }
}