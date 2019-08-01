package com.emem.farm;

public class Main {

    public static void main(String[] args) {
	    Farm farm = new Farm();
	    farm.plants.add(new Juniper());
	    farm.plants.add(new Almond());
        farm.plants.add(new Spruce());
        farm.plants.add(new Juniper());
        farm.plants.add(new Almond());
        farm.plants.add(new Spruce());

        for (int i = 0; i < 80; i++) {
            farm.simulateMonth();
        }

        System.out.println(farm.getTotalFood());
    }
}
