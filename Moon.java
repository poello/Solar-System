package com.company;

public class Moon extends HeavenlyBody {
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        return false;
    }
}
