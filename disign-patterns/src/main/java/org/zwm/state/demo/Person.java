package org.zwm.state.demo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {

    private int hour;

    public void doSomething() {
        if (hour == 7) {
            System.out.println("吃早餐");
        } else if (hour == 12) {
            System.out.println("吃中饭");
        } else if (hour == 18) {
            System.out.println("吃晚饭");
        } else {
            System.out.println("未定义");
        }
    }
}
