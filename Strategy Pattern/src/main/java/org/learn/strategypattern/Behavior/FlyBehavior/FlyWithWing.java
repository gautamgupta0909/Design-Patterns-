package org.learn.strategypattern.Behavior.FlyBehavior;

public class FlyWithWing implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly With Wings");
    }
}
