package com.geometriccalc;
import java.util.Scanner;

public class SphereVolume {

    double pi, radius, volume;

    public double getPi() {
        return pi;
    }
    public double getRadius() {
        return radius;
    }
    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return pi + " " + radius+ " " + volume;
    }
    public void sphereVolumeCalc() {

        pi = 3.14159265359;
        volume = 0;



        System.out.println("Welcome to calculator, which will calculate Volume of a sphere. Please type radius length of a Sphere : ");
        Scanner radiusScanner = new Scanner(System.in);
        radius = Double.parseDouble(radiusScanner.nextLine());
        System.out.println("The sphere radius is: " + getRadius() + ". Calculating the Sphere volume.");
        volume = (4/3) * pi * (radius * radius * radius);
        String volumeOutput = String.format("%.2f", volume);
        System.out.println("So, the sphere volume is: " + volumeOutput);

    }
}
