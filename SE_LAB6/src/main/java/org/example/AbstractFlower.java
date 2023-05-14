package org.example;

public abstract class AbstractFlower {

    public String name;
    public AbstractFlower(String x){
        this.name = x;
    }
    abstract public String getName();
}
