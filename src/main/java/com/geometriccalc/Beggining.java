package com.geometriccalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.*;


@SpringBootApplication
public class Beggining {

    public static void main(String[] args) throws IOException {

        String choice;

        System.out.println("Welcome to Rectangle Calculator! This Calculator is able to calculate size from lengths of its sides and side if you know size and one of its sides length.");
        System.out.println("If you want to calculate size of Rectangle, type '1' and if you want to calculate unknown length of a single side, type '2'.");
        System.out.println("If you want to calculate volume of a sphere, type '3'");
        Scanner choiceScanner = new Scanner(System.in);
        choice = choiceScanner.nextLine();
        if (choice.equals("1")) {
            RecCalc firstCalc = new RecCalc();
            firstCalc.RecCalcNominal();
        } else if (choice.equals("2")) {
            ReverseRecCalc reverseCalculator = new ReverseRecCalc();
            reverseCalculator.calcWallCalc();
        } else if (choice.equals("3")){
            SphereVolume sphereVolumeCalc = new SphereVolume();
            sphereVolumeCalc.sphereVolumeCalc();
        } else {
            System.out.println("Warning. Command not received. Shutting down.");
        }

    }
}


