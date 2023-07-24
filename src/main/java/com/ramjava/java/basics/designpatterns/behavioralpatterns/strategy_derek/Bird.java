package com.ramjava.java.basics.designpatterns.behavioralpatterns.strategy_derek;

public class Bird extends Animal {
    public Bird() {
        super();
        setSound("Tweet");
        flyingType = new ItFlys();
    }
}
