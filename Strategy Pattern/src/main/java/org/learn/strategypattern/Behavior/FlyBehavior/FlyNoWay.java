package org.learn.strategypattern.Behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't Fly");
    }
}
