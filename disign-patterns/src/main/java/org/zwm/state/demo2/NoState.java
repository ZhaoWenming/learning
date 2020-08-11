package org.zwm.state.demo2;

public class NoState extends State {
    @Override
    public void doSomething(Context person) {
        System.out.println(person.getHour() + "未定义");
    }
}
