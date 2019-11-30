package com.hillel.lecture_10.galaxy;

public abstract class PlanetSystemAbstract {
    public String namePlanetSystem;
    public int numberPlanets;

    public PlanetSystemAbstract(String namePlanetSystem, int numberPlanets) {
        this.namePlanetSystem = namePlanetSystem;
        this.numberPlanets = numberPlanets;
    }

    public PlanetSystemAbstract(String namePlanetSystem) {
        this.namePlanetSystem = namePlanetSystem;
    }

    public abstract void move();
    public abstract void weight();
    public abstract void  live();
}
