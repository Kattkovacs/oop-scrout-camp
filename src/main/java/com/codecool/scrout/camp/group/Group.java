package com.codecool.scrout.camp.group;

public abstract class Group {
    protected int numberOfMembers;
    protected int ropeInMeter;

    public Group(int numberOfMembers, int ropeInMeter) {
        this.numberOfMembers = numberOfMembers;
        this.ropeInMeter = ropeInMeter;
    }

    public abstract boolean getWood();

    public abstract boolean build();

    public abstract boolean fireStarting();


}
