package org.example.IranianClasses;

import org.example.AbstractClasses.AbstractFlower;

public class IranianFlower extends AbstractFlower {
    public IranianFlower(String x) {
        super(x);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public IranianFlower clone(){
        return new IranianFlower(this.name);
    }
}
