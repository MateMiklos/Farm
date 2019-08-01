package com.emem.farm;

public class Juniper extends Plant {

    public Juniper() {
        production = 14;
        evergreen = true;
    }

    @Override
    public int foodProduce() {
        if (production == 70) {
            speak();
        }
        return production;
    }

    public void speak() {
        System.out.println("Juniper at full production!");
    }
}
