package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int numberArray1,numberArray2;
        int random_number1;
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Please enter size array1 N: ");

        if (!scanner.hasNextInt()){
            System.out.println("Please enter int!");
        }
        else{
            numberArray1 = scanner.nextInt();
            System.out.print("Please enter size array1 N: ");

            if (!scanner.hasNextInt()){
                System.out.println("Please enter int!");
            }
            else {
                numberArray2 = scanner.nextInt();
                // System.out.println(numberArray);
                int[] arrayNumber1 = new int[numberArray1];
                int[] arrayNumber2 = new int[numberArray2];

                int[][] resultArrayNumber = new int[2][numberArray2];

                for (int i = 0; i < numberArray1; i++) {
                    random_number1 = 0 + (int) (Math.random() * 1000);
                    //  System.out.println(random_number1);
                    arrayNumber1[i] = random_number1;
                }
                for (int i = 0; i < numberArray2; i++) {
                    random_number1 = 0 + (int) (Math.random() * 1000);
                    //  System.out.println(random_number1);
                    arrayNumber2[i] = random_number1;
                }
                // int random_number1 = 0 + (int) (Math.random() * 1000);
                arrayNumber1 = BildArray(arrayNumber1);
                arrayNumber2 = BildArray(arrayNumber2);

                System.out.println();
                for (int i = 0; i < numberArray1; i++) {
                    System.out.format("%s,", arrayNumber1[i]);
                }
                System.out.println();
                for (int i = 0; i < numberArray2; i++) {
                    System.out.format("%s,", arrayNumber2[i]);
                }

                resultArrayNumber = FormArrayNumber(arrayNumber1,arrayNumber2);

                System.out.println();
                System.out.println();
                System.out.print("elements ");
                for (int i = 0; i < numberArray2; i++) {
                    System.out.format("%s,", resultArrayNumber[0][i]);
                }
                System.out.println();
                System.out.print("position ");
                for (int i = 0; i < numberArray2; i++) {
                    System.out.format("%s,", resultArrayNumber[1][i]);
                }
            }
        }

    }

    public static int[][] FormArrayNumber(int[] Array1,int[] Array2){
        int[][] returnAndArray = new int[2][Array2.length];
        int j=0;
        for(int i=0; i<Array1.length;i++){
            if(Array1[i]>Array2[j]){
                returnAndArray[0][j]=Array2[j];
                returnAndArray[1][j]=i+1;
                j++;
                i--;
                if(j==Array2.length){
                    break;
                }
            }
        }
        if(j< Array2.length){
            for(int l=j;l< Array2.length;l++){
                returnAndArray[0][l]=Array2[l];
                returnAndArray[1][l]=Array1.length+1;
            }
        }
        return returnAndArray;
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

