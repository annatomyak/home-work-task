package com.hillel.lecture_10.galaxy;

public class MainUniverse {
    public static void main(String[] args) {
        MilkyWayGalaxy milkyWayGalaxy =new MilkyWayGalaxy("MilkyWayGalaxy",1000000,"spiral",10);
        milkyWayGalaxy.move();
        milkyWayGalaxy.size();

        SolarSystem solarSystem =new SolarSystem("Solar System", 8);
        solarSystem.live();
        solarSystem.move();
        solarSystem.weight();
        Planets earth= new Planets("Solar System","Earth",30,5.97*Math.pow(10,24));
        earth.live();
        earth.weight();
        earth.move();


    }
}
