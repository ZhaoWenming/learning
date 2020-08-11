package org.zwm.state;

public class CloseState implements State {
    @Override
    public void action(Context context) {
        System.out.println("当前状态为关");
        context.setState(new OpenState());
        System.out.println("电灯打开");
    }
}
