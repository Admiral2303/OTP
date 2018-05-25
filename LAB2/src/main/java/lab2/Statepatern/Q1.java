package lab2.Statepatern;

public class Q1 extends State {

    @Override
    public void Handle(Event event, StateFSM context) {
        if(event == Event.PLUS){
            context.curentstate = new Q2();
        } else{
            context.curentstate = new ERROR();
        }
    }
}
