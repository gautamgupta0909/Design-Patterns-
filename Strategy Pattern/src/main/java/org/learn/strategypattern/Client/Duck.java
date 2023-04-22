package org.learn.strategypattern.Client;

import org.learn.strategypattern.Behavior.FlyBehavior.FlyBehavior;
import org.learn.strategypattern.Behavior.QuackBehavior.QuackBehavior;

public abstract class Duck  {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    //This part will be same for all the child classes of the duck
    public abstract void display();
    public abstract void swim();

    public void fly() {
        flyBehavior.fly();
    }
    public void quack() {
        quackBehavior.quack();
    }

}
