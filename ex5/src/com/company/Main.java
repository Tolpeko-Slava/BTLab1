package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int numberArray;
        int random_number1;
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Please enter N: ");

        if (!scanner.hasNextInt()){
            System.out.println("Please enter int!");
        }
        else{
            numberArray = scanner.nextInt();
            // System.out.println(numberArray);
            int[] arrayNumber = new int[numberArray];
            for(int i=0;i<numberArray;i++){
                random_number1 = 0 + (int) (Math.random() * 1000);
                //  System.out.println(random_number1);
                arrayNumber[i]=random_number1;
                System.out.println(arrayNumber[i]);
            }
            // int random_number1 = 0 + (int) (Math.random() * 1000);
            System.out.println();
            System.out.println(FindSingleNumber(arrayNumber));

        }

    }

    public static int FindSingleNumber(int[] numberArray){
        int minKolElement=numberArray.length;
        int kolElement=0;
        int number;
        for(int i=0;i<numberArray.length-1;i++){
            kolElement=i;
            number= numberArray[i];
            for(int cycle=i+1;cycle<numberArray.length;cycle++){
                if(number>numberArray[cycle]){
                    kolElement++;
                }
                else{
                    number=numberArray[cycle];
                }
            }
            if(kolElement<minKolElement){
                minKolElement=kolElement;
            }
        }
        return  minKolElement;
    }


}
