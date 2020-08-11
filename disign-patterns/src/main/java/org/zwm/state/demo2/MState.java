package org.zwm.state.demo2;

public class MState extends State {
    @Override
    public void doSomething(Context person) {
        if (person.getHour() == 7){
            System.out.println("吃早饭");
        }else {
            person.setState(new LState());
            person.doSomething();
        }
    }
}
