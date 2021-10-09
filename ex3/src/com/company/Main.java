package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double minParam,maxParam,goParm;

        Scanner scanner = new  Scanner(System.in);
        System.out.print("Please enter A: ");
        minParam = scanner.nextDouble();//3,4
        System.out.print("Please enter B: ");
        maxParam = scanner.nextDouble();//3,4
        System.out.print("Please enter H: ");
        goParm = scanner.nextDouble();//3,4

        System.out.println("Par   ||    Result");
        System.out.println("------------------");

        for(double i = minParam ; i <= maxParam ; i = i + goParm ){
            System.out.format("%.3f  ||%.3f", i,Math.tan(i));
            System.out.println();
        }

    }
}
