package org.zwm.builder.kfc1;

public abstract class Builder {
    abstract Builder setChicken();
    abstract Builder setCola();
    abstract Builder setPizza();
    abstract KFC getKFC();
}
