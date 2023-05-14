package org.example.AbstractClasses;

public abstract class AbstractFlower {

    public String name;
    public AbstractFlower(String x){
        this.name = x;
    }
    abstract public String getName();
    abstract public Object clone();
}
