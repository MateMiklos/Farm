package com.emem.farm;

public class Spruce extends Plant implements Shroom {

    private boolean isRotten = false;

    public Spruce() {
        production = 26;
        evergreen = true;
    }

    @Override
    public int foodProduce() {
        growShroom();
        rot();
        if (isRotten) {
            return 0;
        }
        if (production == 70) {
            speak();
        }
        return production;
    }

    public void speak() {
        System.out.println("Spruce at full production!");
    }


    @Override
    public void growShroom() {
        if (random.nextInt(101) <= 5) {
            production += 15;
        }
    }

    @Override
    public void rot() {
        if (random.nextInt(101) <= 4) {
            production -= 20;
            isRotten = true;
        }
    }
}
