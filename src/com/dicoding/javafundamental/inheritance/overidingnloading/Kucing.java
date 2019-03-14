package com.dicoding.javafundamental.inheritance.overidingnloading;

public class Kucing extends Hewan {
    public void makan() { // overriding
        System.out.println("Kucing sedang makan..");
    }

    public void makan(String food) { // overloading
        System.out.println("Kucing makan " + food);
    }
}
