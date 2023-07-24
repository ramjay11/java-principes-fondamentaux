package com.ramjava.java.basics.designpatterns.behavioralpatterns.strategy_derek;

public class Dog extends Animal {
    public void dighole() {
        System.out.println("Dug a hole");
    }
    public Dog() {
        super();
        setSound("Bark");
        flyingType = new CantFly();
    }
}
