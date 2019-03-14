package com.dicoding.javafundamental.inheritance.Polymorphism;

public class Hewan {
    public void makan() { // base method
        System.out.println("Hewan sedang makan..");
    }
}




class Kucing extends Hewan {
    public void makan() { // overriding
        System.out.println("Kucing sedang makan..");
    }
    public void makan(int food) { // overloading
        System.out.println("Kucing makan " + food);
    }
}