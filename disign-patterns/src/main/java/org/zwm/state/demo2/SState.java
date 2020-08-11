package org.zwm.state.demo2;

public class SState extends State {
    @Override
    public void doSomething(Context person) {
        if (person.getHour() == 18){
            System.out.println("吃晚饭");
        }else {
            person.setState(new NoState());
            person.doSomething();
        }
    }
}
