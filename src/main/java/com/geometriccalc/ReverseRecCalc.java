package com.geometriccalc;

import java.util.Scanner;

public class ReverseRecCalc {
    double size, wallOne, wallTwo;


    public double getSize() {
        return size;
    }
    public double getWallOne() {
        return wallOne;
    }
    public double getWallTwo(){
        return wallTwo;
    }
    @Override
    public String toString(){
        return size + " " + wallOne + " " + wallTwo;
    }
    public void calcWallCalc(){

        System.out.println("Welcome to calculator, which will calculate side of a rectangle. First, please type size of a Rectangle in square cantimeters: ");
        Scanner sizeScanner = new Scanner(System.in);
        size = Double.parseDouble(sizeScanner.nextLine());
        System.out.println("So, the Rectangle size is: " + getSize() + " square meters. Now, type please size of a single wall.");
        Scanner wallOneScanner = new Scanner (System.in);
        wallOne = Double.parseDouble(wallOneScanner.nextLine());
        System.out.println("And one of the sides length is: " + getWallOne() + ". So, the second wall length is: " + getSize()/getWallOne() + ".");

    }
}
