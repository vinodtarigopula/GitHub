package com.vinod.HelloNameProject;


public class Bird {
    public String name;
    public String color;
    public boolean canFly;

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", canFly=" + canFly +
                '}';
    }
}
