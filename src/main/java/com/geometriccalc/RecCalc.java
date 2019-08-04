package com.geometriccalc;

import java.util.Scanner;

public class RecCalc {
    double length, width, size;

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return size + " " + length + " " + width;
    }

    public void RecCalcNominal() {

        System.out.println("Welcome to calculator, which will calculate size of a rectangle. First, please type length of a Rectangle in centimeters: ");
        Scanner lengthScanner = new Scanner(System.in);
        length = Double.parseDouble(lengthScanner.nextLine());
        System.out.println("So, the Rectangle side length is:" + getLength() + " centimeters. Now, type please width of a Rectangle.");
        Scanner widthScanner = new Scanner(System.in);
        width = Double.parseDouble(widthScanner.nextLine());
        System.out.println("So, the Rectangle size is " + getLength() * getWidth());
    }
}
