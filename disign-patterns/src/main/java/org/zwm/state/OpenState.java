package org.zwm.state;

public class OpenState implements State {
    @Override
    public void action(Context context) {
        System.out.println("当前状态为开");
        context.setState(new CloseState());
        System.out.println("电灯关闭");
    }
}
