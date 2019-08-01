package com.emem.farm;

public class Almond extends Plant implements Shroom {

    private boolean isRotten = false;

    public Almond() {
        production = 50;
        evergreen = false;
    }

    @Override
    public int foodProduce() {
        growShroom();
        rot();
        if (isRotten) {
            return 0;
        }
        if (production < 40) {
            production *= 2;
        }
        return production;
    }

    @Override
    public void growShroom() {
        if (random.nextInt(101) <= 8) {
            production += 10;
        }
    }

    @Override
    public void rot() {
        if (random.nextInt(101) <= 13) {
            production -= 18;
            isRotten = true;
        }
    }
}
