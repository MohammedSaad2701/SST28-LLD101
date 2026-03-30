import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
    private int id;
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;
    private double maxWeight;
    private Queue<Request> requests;
    private Door door;

    public Elevator(int id, double maxWeight) {
        this.id = id;
        this.maxWeight = maxWeight;
        this.currentFloor = 0;
        this.direction = Direction.IDLE;
        this.state = ElevatorState.STOPPED;
        this.requests = new LinkedList<>();
        this.door = new Door();
    }

    public void addRequest(Request request) {
        requests.offer(request);
    }

    public void move() {
        if (requests.isEmpty()) return;

        Request req = requests.poll();
        System.out.println("Moving to floor " + req.getDestinationFloor());
        this.currentFloor = req.getDestinationFloor();
    }

    public void openDoor() {
        door.open();
    }

    public void closeDoor() {
        door.close();
    }

    public boolean isOverWeight(double weight) {
        return weight > maxWeight;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }
}