package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

Calculator myCalculator = new Calculator();
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter the height of a Rectange:");
            double height = myScanner.nextDouble();
        myCalculator.setHeight(height);


            System.out.println("Enter the width of a Rectange:");
            double width = myScanner.nextDouble();
            myCalculator.setWidth(width);

            double area = myCalculator.caculateArea(
                    +
            );
            System.out.println("Area of Rectangle is:" + area);
    }
}
