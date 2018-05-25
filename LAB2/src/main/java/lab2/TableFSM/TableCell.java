package lab2.TableFSM;
import lab2.Event;
import lab2.State;

public class TableCell {
    State start_state;
    Event event;
    State end_state;

    public TableCell(State start_state, Event event, State end_state) {
        this.start_state = start_state;
        this.event = event;
        this.end_state = end_state;
    }
}
