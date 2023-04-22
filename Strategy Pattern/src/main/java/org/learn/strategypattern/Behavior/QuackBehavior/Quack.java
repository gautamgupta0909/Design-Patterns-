package org.learn.strategypattern.Behavior.QuackBehavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack Sound");
    }
}
