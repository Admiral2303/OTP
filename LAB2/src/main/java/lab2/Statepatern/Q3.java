package lab2.Statepatern;

public class Q3 extends State {
    @Override
    public void Handle(Event event, StateFSM context) {
        if(event == Event.Digit){
            context.curentstate = new Q4();
        } else{
            context.curentstate = new ERROR();
        }
    }
}
