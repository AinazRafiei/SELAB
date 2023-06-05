package org.example.IranianClasses;

import org.example.AbstractClasses.AbstractGardenCreator;

public class IranianCreatore extends AbstractGardenCreator {
    @Override
    public  IranianTree createTree(String x) {
        return new IranianTree(x);
    }

    @Override
    public IranianFlower createFlower(String x) {
        return new IranianFlower(x);
    }

    @Override
    public IranianCreatore clone(){
        return new IranianCreatore();
    }

}
