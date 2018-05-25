package lab2.SwitchFSM;

import lab2.Event;
import lab2.FSM;
import lab2.State;


public class SwitchFSM extends FSM {
    public SwitchFSM(){
        curentstate = State.q1;
    }


    @Override
    public State nextState(Event event) {
        switch (this.curentstate) {
            case q1:
                switch (event) {
                    case PLUS:
                        curentstate = State.q2;
                        break;
                    default:
                        curentstate = State.ERROR;
                }
                break;
            case q2:
                switch (event) {
                    case PLUS:
                        curentstate = State.q2;
                        break;
                    case NODIGIT:
                        curentstate = State.q3;
                        break;
                    case Digit:
                        curentstate = State.q4;
                        break;
                    default:
                        curentstate = State.ERROR;
                }
                break;
            case q3:
                switch (event) {
                    case Digit:
                        curentstate = State.q4;
                        break;
                    default:
                        curentstate = State.ERROR;
                }
                break;
            case q4:
                switch (event) {
                    case NODIGIT:
                        curentstate = State.q3;
                        break;
                    case Digit:
                        curentstate = State.ERROR;
                        break;
                    default:
                        curentstate = State.ERROR;
                }
                break;
            default:
                curentstate = State.ERROR;
        }
        return curentstate;
    }
}
