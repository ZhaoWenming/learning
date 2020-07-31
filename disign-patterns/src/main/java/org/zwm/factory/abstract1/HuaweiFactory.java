package org.zwm.factory.abstract1;

public class HuaweiFactory implements IProductFactory {
    @Override
    public IPhoneProduct iphoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct routerProduct()
    {
        return new HuaweiRouter();
    }
}
