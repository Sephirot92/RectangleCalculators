package com.geometriccalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;
import java.util.*;


@SpringBootApplication
public class Beggining {

    public static void main (String[] args) throws IOException{

        String choice;

        System.out.println("Welcome to Rectangle Calculator! This Calculator is able to calculate size from lengths of its sides and side if you know size and one of its sides length.");
        System.out.println("If you want to calculate size of Rectangle, type 'Nominal' and if you want to calculate unknown length of a single side, type 'Reversed'");
        Scanner choiceScanner = new Scanner(System.in);
        choice = choiceScanner.nextLine();
        if (choice.equals("Nominal")){
           RecCalc firstCalc = new RecCalc();
           firstCalc.RecCalcNominal();
        }else if (choice.equals("Reversed")){
            ReverseRecCalc reverseCalculator = new ReverseRecCalc();
            reverseCalculator.calcWallCalc();
        }else{
            System.out.println("Warning. Command not received. Shutting down.");
        }

    }
}


