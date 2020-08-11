package org.zwm.state.demo2;

public class LState extends State {
    @Override
    public void doSomething(Context person) {
        if (person.getHour() == 12){
            System.out.println("吃午饭");
        } else {
            person.setState(new SState());
            person.doSomething();
        }
    }
}
