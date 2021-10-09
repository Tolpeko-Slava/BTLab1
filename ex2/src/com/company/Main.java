package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double X , Y;
        boolean cordenatsBool = false;
        Scanner scanner = new Scanner(System.in);
        // String name = scanner.nextLine();

        System.out.print("Please enter X: ");
        X = scanner.nextDouble();//3,4
        System.out.print("Please enter Y: ");
        Y = scanner.nextDouble();


        String str = String.format("X = %s , Y = %s", X, Y);
        System.out.println(str);
        cordenatsBool = Cordenatc(X,Y);
        System.out.format("Result: %s", cordenatsBool);
    }

    public static boolean Cordenatc(double x, double y){
        if ( y <= 0 && y > -3 ){
            if ( Math.abs(x) >= 0 && Math.abs(x) <= 6 ){
                return true;
            }
        }
        if ( y > 0 && y < 5 ){
            if ( Math.abs(x) >= 0 && Math.abs(x) <= 4 ){
                return true;
            }
        }
        return false;
    }
}
