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
            int[] arraySortNumber = new int [numberArray];
            for(int i=0;i<numberArray;i++){
                random_number1 = 0 + (int) (Math.random() * 1000);
                //  System.out.println(random_number1);
                arrayNumber[i]=random_number1;
                System.out.format("%s,",arrayNumber[i]);
            }
            // int random_number1 = 0 + (int) (Math.random() * 1000);
            System.out.println();
            arraySortNumber = BildArray(arrayNumber);

            for(int i = 0;i<arrayNumber.length;i++) {
                System.out.format("%s,",arraySortNumber[i]);

            }
        }

    }


    public static int[] BildArray(int[] numberArray){
        int[] Array = new int[numberArray.length];
        Array = numberArray;
        int Between;
        for(int i = 0;i<numberArray.length-1;i++) {
            if(Array[i]>Array[i+1]){
                for(int ifor=i;ifor>=0;ifor--){
                    Between = Array[ifor+1];
                    Array[ifor+1]=Array[ifor];
                    Array[ifor]=Between;
                    if(ifor-1>=0){
                        if(Array[ifor-1]<=Array[ifor]){
                            break;
                        }
                    }
                }
            }
        }
        return Array;
    }


}

