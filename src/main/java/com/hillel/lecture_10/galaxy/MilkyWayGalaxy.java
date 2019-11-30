package com.hillel.lecture_10.galaxy;

public class MilkyWayGalaxy extends GalaxyAbstract {
    private int numbersPlanetSystem;

    public MilkyWayGalaxy (String galaxyName,long weight,String galaxyType,int numbersPlanetSystem){
        super(galaxyName,weight,galaxyType);
        this.numbersPlanetSystem=numbersPlanetSystem;

    }

    @Override
    public void move() {
        System.out.println("Speed = 552 km/sec");

    }

    @Override
    public void size() {
        System.out.println("D=100000");
    }
}
