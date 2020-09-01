package com.codecool.scrout.camp.group;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;

public class BoysGroup extends Group {
    private final int CHANCE_TO_FIND_WOOD = 65;
    private final int CHANCE_TO_BUILD_BUILDING = 75;
    private final int CHANCE_TO_BURNS_FIRE = 70;
    private int sumOfBuildings;

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
        if (rand.nextInt(100) < CHANCE_TO_BUILD_BUILDING) {
            sumOfBuildings++;
            return true;
        }
        return false;
    }

    @Override
    public boolean fireStarting() {
        getWood();
        Random rand = new Random();
        return (rand.nextInt(100) < CHANCE_TO_BURNS_FIRE);
    }

    @Override
    public String toString() {
        return "BoysGroup " + sumOfBuildings + " building(s)" ;
    }


}
