package org.example.IranianClasses;

import org.example.AbstractClasses.AbstractTree;

public class IranianTree extends AbstractTree {

    public IranianTree(String x) {
        super(x);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public IranianTree clone() {
        return new IranianTree(this.name);
    }
}
