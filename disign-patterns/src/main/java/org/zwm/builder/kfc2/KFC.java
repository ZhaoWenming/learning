package org.zwm.builder.kfc2;

import lombok.Builder;
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

    //一定要有Builder参数的建造者
    private KFC(Builder builder){
        this.hambuger = builder.hambuger;
        this.chips = builder.chips;
        this.chicken = builder.chicken;
        this.cola = builder.cola;
        this.pizza = builder.pizza;
    }

    public static class Builder{
        //套餐必点
        private String hambuger;
        private String chips;

        //套餐选点
        private String chicken;
        private String cola;
        private String pizza;

        public Builder(String hambuger, String chips) {
            this.hambuger = hambuger;
            this.chips = chips;
        }

        public Builder setChicken(String msg){
            this.chicken = msg;
            return this;
        }

        public Builder setCola(String msg){
            this.cola = msg;
            return this;
        }

        public Builder setPizza(String msg){
            this.pizza = msg;
            return this;
        }

        //生成一个产品
        public KFC getKFC(){
            return new KFC(this);
        }

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
