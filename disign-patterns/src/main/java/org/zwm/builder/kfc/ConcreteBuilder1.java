package org.zwm.builder.kfc;

public class ConcreteBuilder1 implements Builder {

    private KFC kfc;

    public ConcreteBuilder1(String hambuger, String chips) {
        this.kfc = new KFC(hambuger, chips);
    }

    @Override
    public void setChicken() {
        kfc.setChicken("大鸡腿");
    }

    @Override
    public void setCola() {
        kfc.setCola(null);
        System.out.println("套餐A里面没有可乐");
    }

    @Override
    public void setPizza() {
        kfc.setPizza(null);
        System.out.println("套餐A里没有披萨");
    }

    @Override
    public KFC getKFC() {
        return kfc;
    }
}
