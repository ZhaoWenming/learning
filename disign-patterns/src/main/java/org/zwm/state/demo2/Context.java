package org.zwm.state.demo2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class Context {

    private int hour;

    private State state;

    public Context(){
        this.state = new MState();
    }

    public void doSomething() {
        state.doSomething(this);
        //复位，当所有方法完成之后再执行
        state = new MState();
    }
}
