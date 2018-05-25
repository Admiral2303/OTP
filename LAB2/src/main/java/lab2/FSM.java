package lab2;

public abstract class FSM {
    public State curentstate;


    private lab2.Event recognizeEvent(char ch) {
        Event event = Event.ANY;
        if (ch == '+') {
            event = lab2.Event.PLUS;
        } else if (Character.isDigit(ch)) {
            event = lab2.Event.Digit;
        } else if (!Character.isDigit(ch)) {
            event = lab2.Event.NODIGIT;
        }
        return event;
    }


    public boolean scan(String str) {
        if(str == null){
            return false;
        }
        curentstate = State.q1;
        Event event;
        for (char ch : str.toCharArray()) {
            event = recognizeEvent(ch);
            curentstate = nextState(event);
        }
        return curentstate == State.q4 || curentstate == State.q2;
    }

    protected abstract State nextState(lab2.Event event);


}
