package lab2.TableFSM;

import lab2.Event;
import lab2.State;

import java.util.ArrayList;


public class TransitionTable {
    ArrayList<TableCell> transition = new ArrayList<TableCell>();

    public void addTransition(State startstate, Event e, State endstate) {
        transition.add(new TableCell(startstate, e, endstate));
    }

    public void buildTransitionState() {
        addTransition(State.q1, Event.PLUS, State.q2);
        addTransition(State.q2, Event.PLUS, State.q2);
        addTransition(State.q2, Event.NODIGIT, State.q3);
        addTransition(State.q2, Event.Digit, State.q4);
        addTransition(State.q3, Event.Digit, State.q4);
        addTransition(State.q4, Event.NODIGIT, State.q3);
    }
}
