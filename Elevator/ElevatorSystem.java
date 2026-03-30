import java.util.List;

public class ElevatorSystem {
    private List<Elevator> elevators;
    private ElevatorStrategy strategy;

    public ElevatorSystem(List<Elevator> elevators, ElevatorStrategy strategy) {
        this.elevators = elevators;
        this.strategy = strategy;
    }

    public void requestElevator(Request request) {
        Elevator elevator = strategy.selectElevator(request, elevators);
        elevator.addRequest(request);
    }

    public void processRequests() {
        for (Elevator e : elevators) {
            e.move();
        }
    }
}