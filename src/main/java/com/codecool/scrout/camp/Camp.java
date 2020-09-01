package com.codecool.scrout.camp;

import com.codecool.scrout.camp.group.Group;

import java.util.Set;

public class Camp {
    private int durationInDays;
    private Set<Group> groups;

    public Camp(int durationInDays, Set<Group> groups) {
        this.durationInDays = durationInDays;
        this.groups = groups;
    }

    public void fireStraterRace() {
        for (int i = 1; i < durationInDays + 1; i++) {
            System.out.println("Day: " + i);
            for (Group group : groups) {
                if (group.getWood()) {
                    if (group.build()) {
                        if (group.fireStarting()) {
                            System.out.println("The fire started by: " + group.toString());
                        }
                    }
                }
            }
        }
    }
}
