package com.hillel.lecture_10.galaxy;

public class SolarSystem extends PlanetSystemAbstract {


    public SolarSystem(String namePlanetSystem, int numberPlanets) {
        super(namePlanetSystem, numberPlanets);
    }

    @Override
    public void move() {
        System.out.println("SolarSystem move fast");
    }

    @Override
    public void weight() {
        System.out.println("1,0014 *weight of Sun");

    }

    @Override
    public void live() {
        System.out.println("SolarSystem has a planet with life");
    }
}
