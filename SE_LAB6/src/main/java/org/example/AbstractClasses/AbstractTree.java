package org.example.AbstractClasses;

public abstract class AbstractTree {
    public String name;
    public AbstractTree(String x){
        name = x;
    }
    abstract public String getName();
}
