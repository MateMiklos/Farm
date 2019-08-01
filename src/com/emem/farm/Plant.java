package com.emem.farm;

import java.util.Random;

public abstract class Plant {

    Random random = new Random();

    protected int monthPassed;
    protected int production;
    protected boolean evergreen;

    public abstract int foodProduce();

    public void grows() {
        production += 4;
        monthPassed++;
        if (evergreen) {
            if (monthPassed % 5 == 0) {
                production += 8;
            }
            if (production > 70) {
                production = 70;
            }
        }
    }
}
