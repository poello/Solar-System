package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetChallenge {

    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<Planet> planets = new HashSet<>();
    private static Set<HeavenlyBody> heavenlyBodies = new HashSet<>();

    public static void main(String[] args) {
        Planet temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        planets.add(temp);

        temp = new Planet("Wenus", 225);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        planets.add(temp);

        Moon tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), temp);
        heavenlyBodies.add(tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        heavenlyBodies.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        heavenlyBodies.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        heavenlyBodies.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        heavenlyBodies.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        heavenlyBodies.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        heavenlyBodies.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        planets.add(temp);

        Star sun = new Star("Earth", 0);
        solarSystem.put(sun.getKey(), sun);
        heavenlyBodies.add(sun);

        tempMoon = new Moon("Mooooooooon", 13);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        heavenlyBodies.add(tempMoon);

        sun.addSatellite(tempMoon);
        sun.addSatellite(temp);
        temp.addSatellite(sun);
//        tempMoon.addMoon(temp);

        System.out.println("Heavenly bodies");
        for(HeavenlyBody body : heavenlyBodies) {
            System.out.println("\t" + body);
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", "Planet"));
        System.out.println("Moons of " + body.getKey().getName());
        for(HeavenlyBody jupiterMoon : body.getSatellites()) {
            System.out.println("\t" + jupiterMoon);
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody heavenlyBody : heavenlyBodies) {
            moons.addAll(heavenlyBody.getSatellites());
        }

        System.out.println("All moons ");
        for(HeavenlyBody moon : moons) {
            System.out.println("\t" + moon);
        }

        Planet pluto = new Planet("Pluto", 842);
        planets.add(pluto);

        for(HeavenlyBody planet : planets) {
            System.out.println(planet);
        }

        System.out.println("===================");

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(pluto));
        System.out.println(pluto.equals(earth1));

        System.out.println("The solar system contains:");
        for(HeavenlyBody heavenlyBody : solarSystem.values()) {
            System.out.println(heavenlyBody);
        }
    }
}
