package com.vinod.HelloNameProject;


public class MainClass {
    public static void main(String [ ]args) {

        Department department1 = new Department();
        department1.name = "physics";
        department1.Address = "Hyd";

        Department department2 = new Department();
        department2.name = "Social";
        department2.Address = "Fremont";

        Bird bird1 = new Bird();
        bird1.name = "Eagle";
        bird1.color = "Brown";
        bird1.canFly = true;

        Bird bird2 = new Bird();
        bird2.name = "Penguin";
        bird2.color = "Black And White";
        bird1.canFly = false;

        System.out.println(bird1);
        System.out.println(bird2);
        System.out.println(department1);
        System.out.println(department2);
    }
}
