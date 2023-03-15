package com.vinod.firstproject.MyFirstSpringBootProject;

public class MainClass {
    public static void main(String []args){
        Bird eagle = new Bird();
        eagle.color = "Brown";
        eagle.canFly = true;

        Vehicle car = new Vehicle();
        car.noOfDoors = 4;
        car.noOfTyres = 4;
        car.mileage = 20;
        car.maxSpeed = 200;

    }
}
