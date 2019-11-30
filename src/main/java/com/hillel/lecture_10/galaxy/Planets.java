package com.hillel.lecture_10.galaxy;

public   class Planets extends PlanetSystemAbstract {
    private String namePlanet;
    private long radiusPlanet;
    private long speedPlanet;
    private double weightPlanet;

    public Planets(String namePlanetSystem, String namePlanet, long speedPlanet, double weightPlanet) {
        super(namePlanetSystem);
        this.namePlanet=namePlanet;
        this.speedPlanet=speedPlanet;
        this.weightPlanet=weightPlanet;
    }


    @Override
    public void move() {
        System.out.println(namePlanet + " move with speed in km/sec= "+speedPlanet);
    }

    @Override
    public void weight() {
        System.out.println(namePlanet + " has a weight=  "+weightPlanet);
    }

    @Override
    public void live() {
        if (namePlanetSystem.equals("Solar System")) {
            System.out.println("This planet maybe has s life");
        } else {
            System.out.println("This planet maybe hasn`t s life");
        }
    }
    public void radius(){
        System.out.println(radiusPlanet);
    }
}
