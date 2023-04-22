package org.learn.strategypattern.Behavior.QuackBehavior;

public class Mute implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Mute");
    }
}
