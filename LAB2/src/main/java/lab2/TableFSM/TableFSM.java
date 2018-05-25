package lab2.TableFSM;
import lab2.Event;
import lab2.FSM;
import lab2.State;

public class TableFSM extends FSM {
    public TableFSM(){
        curentstate = State.q1;
    }

    @Override
    public State nextState(Event event) {
        TransitionTable transitionTable = new TransitionTable();
        transitionTable.buildTransitionState();
        for(TableCell cell: transitionTable.transition) {
            if(curentstate == cell.start_state && cell.event == event){
                curentstate = cell.end_state;
                return curentstate;
            }
        }
        curentstate = State.ERROR;
        return curentstate;
    }
}
