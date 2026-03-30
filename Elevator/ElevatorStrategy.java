import java.util.List;

public interface ElevatorStrategy {
    Elevator selectElevator(Request request, List<Elevator> elevators);
}