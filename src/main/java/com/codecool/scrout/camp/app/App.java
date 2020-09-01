package com.codecool.scrout.camp.app;

import com.codecool.scrout.camp.Camp;
import com.codecool.scrout.camp.group.BoysGroup;
import com.codecool.scrout.camp.group.GirlsGroup;
import com.codecool.scrout.camp.group.Group;

import java.util.HashSet;
import java.util.Set;

public class App 
{
    public static void main( String[] args )
    {
        Set<Group> groups = new HashSet<>();
        groups.add(new GirlsGroup(6, 400));
        groups.add(new BoysGroup(6, 400));
        groups.add(new GirlsGroup(8, 400));
        groups.add(new BoysGroup(7, 400));
        groups.add(new GirlsGroup(5, 400));
        groups.add(new BoysGroup(4, 400));
        Camp camp = new Camp(10, groups);
        camp.fireStraterRace();
    }
}
