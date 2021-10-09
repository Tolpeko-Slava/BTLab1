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
            }
           // int random_number1 = 0 + (int) (Math.random() * 1000);
            for(int i=0;i<numberArray;i++){
                if(FindSingleNumber(arrayNumber[i])){
                    System.out.format("%s  || %s",i, arrayNumber[i]);
                    System.out.println();
                }

            }
        }

    }

    public static boolean FindSingleNumber(int number){
        if(number==2){
            return true;
        }
        for(int num=2;num<number;num++){
            if(number%num == 0){
                return false;
            }
        }
        return true;
    }


}
