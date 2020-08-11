package org.zwm.state;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void stateChange() {
        state.action(this);
    }

}
