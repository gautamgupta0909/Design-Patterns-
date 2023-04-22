package org.learn.strategypattern.Behavior.QuackBehavior;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Rubber Duck Squeak Sound");
    }
}
