package behavioral.memento;

import java.util.List;

// Denotes a state for the database
public class Snapshot {
    private final List<String> state;

    public Snapshot(List<String> state) {
        // Create a deep copy of the state to preserve immutability
        this.state = List.copyOf(state);
    }

    public List<String> getState() {
        return state;
    }
}
