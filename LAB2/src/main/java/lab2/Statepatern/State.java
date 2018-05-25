package lab2.Statepatern;

public abstract class State {
    public abstract void Handle(Event event, StateFSM stateFSM);
}
