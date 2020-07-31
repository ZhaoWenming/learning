package org.zwm.factory.abstract1;

public class XiaomiFactory implements IProductFactory {
    @Override
    public IPhoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new XiaomiRouter();
    }
}
