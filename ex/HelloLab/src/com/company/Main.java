package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double X , Y;
        double degrees;
        double sinResult;
        double exResult;
        Scanner scanner = new Scanner(System.in);
       // String name = scanner.nextLine();

        System.out.print("Please enter X: ");
        X = scanner.nextDouble();//3,4
//        System.out.println();
        System.out.print("Please enter Y: ");
        Y = scanner.nextDouble();
//        System.out.println();

        String str = String.format("X = %s , Y = %s", X, Y);
        System.out.println(str);

        degrees = X + Y;
        //radians = Math.toRadians(degrees);

        sinResult = Math.sin(degrees);

        exResult = 1 + Math.pow(sinResult, 2);

        double exDownResult = 2+Math.abs(X-(2*X)/(1+Math.pow(X, 2)*Math.pow(Y, 2)));

        exResult = exResult/exDownResult;
        exResult=exResult+X;
        System.out.format("Resualt = %s", exResult);
    }

}
