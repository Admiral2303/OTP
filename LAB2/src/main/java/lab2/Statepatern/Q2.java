package lab2.Statepatern;

public class Q2 extends State {
    @Override
    public void Handle(Event event, StateFSM context) {
        if(event == Event.PLUS){
            context.curentstate = new Q2();
        } else if (event == Event.NODIGIT){
            context.curentstate = new Q3();
        } else if(event == Event.Digit){
            context.curentstate = new Q4();
        } else{
            context.curentstate = new ERROR();
        }
    }
}
