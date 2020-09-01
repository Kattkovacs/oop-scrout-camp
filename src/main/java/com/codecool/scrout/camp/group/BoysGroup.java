package com.codecool.scrout.camp.group;

import java.util.Random;

public class BoysGroup extends Group {
    private final int CHANCE_TO_FIND_WOOD = 65;
    private final int CHANCE_TO_BUILD_BUILDING = 75;
    private final int CHANCE_TO_BURNS_FIRE = 70;

    public BoysGroup(int numberOfMembers, int ropeInMeter) {
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
        return (rand.nextInt(100) < CHANCE_TO_BUILD_BUILDING);
    }

    @Override
    public boolean fireStarting() {
        Random rand = new Random();
        return (rand.nextInt(100) < CHANCE_TO_BURNS_FIRE);
    }

    @Override
    public String toString() {
        return "BoysGroup";
    }


}
