package com.hillel.lecture_10.galaxy;

public abstract class GalaxyAbstract {
    private   String galaxyName;
    private long weight;
    private String galaxyType;

    public GalaxyAbstract(String galaxyName,long weight,String galaxyType) {
        this.galaxyName = galaxyName;
        this.weight = weight;
        this.galaxyType = galaxyType;
    }

    public GalaxyAbstract() {
    }

    public abstract void move();
    public abstract void size();


}


