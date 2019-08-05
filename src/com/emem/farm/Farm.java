package com.emem.farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private int totalFood;

    public int getTotalFood() {
        return totalFood;
    }

    public List<Plant> plants = new ArrayList<>();

    public Farm() {
        totalFood = 0;
    }

    public void simulateMonth() {
        for (Plant plant : plants) {
            plant.grows();
            totalFood += plant.foodProduce();
        }
    }
}
