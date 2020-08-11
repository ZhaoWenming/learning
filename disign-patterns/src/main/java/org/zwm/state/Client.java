package org.zwm.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new CloseState());
        context.stateChange();
        context.stateChange();
        context.stateChange();
        context.stateChange();
        context.stateChange();
        context.stateChange();
        context.stateChange();
    }
}
