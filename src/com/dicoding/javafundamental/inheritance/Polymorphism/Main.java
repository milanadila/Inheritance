package com.dicoding.javafundamental.inheritance.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Object o = new Kucing();
        Hewan h = new Kucing();
        Kucing k = new Kucing();

        h.makan();
        k.makan();

        Object object = k;
        Hewan hewan = k;

        hewan.makan();

        Kucing kucing = (Kucing) h;
        kucing.makan();

        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau;
    }
}
