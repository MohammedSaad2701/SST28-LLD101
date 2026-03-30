import java.util.*;

public class Main {
    public static void main(String[] args) {
        Elevator e1 = new Elevator(1, 500);
        Elevator e2 = new Elevator(2, 500);

        List<Elevator> elevators = Arrays.asList(e1, e2);

        ElevatorStrategy strategy = new NearestElevatorStrategy();
        ElevatorSystem system = new ElevatorSystem(elevators, strategy);

        Request r1 = new Request(0, 5, Direction.UP);
        system.requestElevator(r1);

        system.processRequests();
    }
}