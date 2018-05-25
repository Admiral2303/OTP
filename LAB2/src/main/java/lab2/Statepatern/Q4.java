package lab2.Statepatern;

public class Q4 extends State {
    @Override
    public void Handle(Event event, StateFSM stateFSM) {
        if(event == Event.NODIGIT){
            stateFSM.curentstate = new Q3();
        } else{
            stateFSM.curentstate = new ERROR();
        }
    }
}
