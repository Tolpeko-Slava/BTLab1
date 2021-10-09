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
            int[]arrayNumber = new int[numberArray];
            for(int i=0;i<numberArray;i++){
                random_number1 = 0 + (int) (Math.random() * 1000);
                //  System.out.println(random_number1);
                arrayNumber[i]=random_number1;
                System.out.println(arrayNumber[i]);
            }
            // int random_number1 = 0 + (int) (Math.random() * 1000);
            System.out.println();
            int[][] matArrayNumber = new int[numberArray][numberArray];
            matArrayNumber = BildArrayBin(arrayNumber);

            for(int i = 0;i<arrayNumber.length;i++) {
                for (int j = 0; j < arrayNumber.length; j++) {
                    System.out.format("%s  ",matArrayNumber[i][j]);
                }
                System.out.println();
            }
        }

    }

    public static int[][] BildArrayBin(int[] numberArray){
        int[][] ReturnArray = new int[numberArray.length][numberArray.length];
        int KolArray = 0;
        int iKolAr;
        for(int j = 0;j<numberArray.length;j++) {
            iKolAr=KolArray;
            for (int i = 0; i < numberArray.length; i++) {
                if(iKolAr<numberArray.length) {
                    ReturnArray[i][j] = numberArray[iKolAr];
                }
                else{
                    iKolAr=0;
                    ReturnArray[i][j] = numberArray[iKolAr];
                }
                iKolAr++;
            }
            KolArray++;
        }
        return ReturnArray;
    }


}

