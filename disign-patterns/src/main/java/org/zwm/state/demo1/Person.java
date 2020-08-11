package org.zwm.state.demo1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {

    private int hour;

    private State state;

    public void doSomething() {
        if (hour == 7) {
            state = new MState();
            state.doSomething();
        } else if (hour == 12) {
            state = new LState();
            state.doSomething();
        } else if (hour == 18) {
            state = new SState();
            state.doSomething();
        } else {
            state = new NoState();
            state.doSomething();
        }
    }
}
