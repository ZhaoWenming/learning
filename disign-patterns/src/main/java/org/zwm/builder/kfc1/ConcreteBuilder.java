package org.zwm.builder.kfc1;

public class ConcreteBuilder extends Builder {
    KFC kfc;

    public ConcreteBuilder(String hamburger, String chips) {
        this.kfc = new KFC(hamburger, chips);
    }

    @Override
    Builder setChicken() {
        kfc.setChicken("鸡腿");
        return this;
    }

    @Override
    Builder setCola() {
        kfc.setCola("可乐");
        return this;
    }

    @Override
    Builder setPizza() {
        kfc.setPizza("披萨");
        return this;
    }

    @Override
    KFC getKFC() {
        return kfc;
    }
}
