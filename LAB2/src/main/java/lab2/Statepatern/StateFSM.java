package lab2.Statepatern;

public class StateFSM {
    State curentstate;
    public StateFSM(){
        curentstate = new Q1();
    }

    protected Event recognizeEvent(char ch) {
        Event event = Event.ANY;
        if(ch == '+'){
            event = Event.PLUS;
        } else if(Character.isDigit(ch)){
            event = Event.Digit;
        } else if(!Character.isDigit(ch)){
            event = Event.NODIGIT;
        }
        return event;
    }


    public boolean scan(String str){
        if(str == null){
            return false;
        }
        Event event;
        curentstate = new Q1();
        for(char ch : str.toCharArray()){
            event = recognizeEvent(ch);
            nextState(event);
        }
        if(curentstate instanceof Q2 || curentstate instanceof Q4){
            return true;
        } else {
            return false;
        }
    }

    protected void nextState(Event event) {
        curentstate.Handle(event, this);
    }


}
