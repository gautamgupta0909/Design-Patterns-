package org.learn.strategypattern.Client;

public class MallardDuck extends Duck{

    @Override
    public void display() {
        System.out.println("Looks like Mallard");
    }

    @Override
    public void swim() {
        System.out.println("Swim like Mallard");
    }
}
