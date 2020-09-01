package com.codecool.scrout.camp.group;

import java.util.Random;

public class GirlsGroup extends Group {
    private final int CHANCE_TO_FIND_WOOD = 55;
    private final int CHANCE_TO_BUILD_BUILDING = 85;
    private final int CHANCE_TO_BURNS_FIRE = 75;
    private int sumOfBuildings;
    private int countOfTries;

    public GirlsGroup(int numberOfMembers, int ropeInMeter) {
        super(numberOfMembers, ropeInMeter);
    }

    @Override
    public boolean getWood() {
        Random rand = new Random();
        return (rand.nextInt(100) < CHANCE_TO_FIND_WOOD);
    }

    @Override
    public boolean build() {
        Random rand = new Random();
        if (rand.nextInt(100) < CHANCE_TO_BUILD_BUILDING) {
            sumOfBuildings++;
            return true;
        }
        return false;
    }

    @Override
    public boolean fireStarting() {
        Random rand = new Random();
        return (rand.nextInt(100) < CHANCE_TO_BURNS_FIRE);
    }

    @Override
    public String toString() {
        return "GirlsGroup has " + sumOfBuildings + " building(s)" ;
    }
}
