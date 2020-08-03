package org.zwm.builder.kfc1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class KFC {

    //套餐必点
    private String hambuger;
    private String chips;

    //套餐选点
    private String chicken;
    private String cola;
    private String pizza;

    //必点
    public KFC(String hambuger, String chips) {
        this.hambuger = hambuger;
        this.chips = chips;
    }

    @Override
    public String toString() {
        return "KFC{" +
                "hambuger='" + hambuger + '\'' +
                ", chips='" + chips + '\'' +
                ", chicken='" + chicken + '\'' +
                ", cola='" + cola + '\'' +
                ", pizza='" + pizza + '\'' +
                '}';
    }
}
