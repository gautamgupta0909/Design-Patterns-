package org.learn.strategypattern.Client;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Looks like rubber duck");
    }

    @Override
    public void swim() {
        System.out.println("Swim Like rubber duck");

    }
}
