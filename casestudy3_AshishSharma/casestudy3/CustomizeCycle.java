package com.pepcus.training.casestudy3;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class CustomizeCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long startTime = System.nanoTime();
        parsedCsv pcsv = new parsedCsv();
        Bicycle bc = new Bicycle();


        System.out.println("--------Welcome to FineRide----------");
        System.out.println("-------------------------------------");
        pcsv.printCsv();
        System.out.println("Please enter your Model Choice!");

        bc.itemizeModel1();
        bc.itemizeModel2();
        bc.itemizeModel3();

        int[] modelPriceList = new int[3];

        modelPriceList[0] = bc.getModel1Price();
        modelPriceList[1] = bc.getModel2Price();
        modelPriceList[2] = bc.getModel3Price();

        CustomizeCycle cc = new CustomizeCycle();
        int costlyModelNo = cc.getIndexOfLargest(modelPriceList) + 1;
        int cheapestModelNo = cc.getIndexOfMinimum(modelPriceList) + 1;
        System.out.println("Our costliest bike is model " + costlyModelNo);
        System.out.println("Our cheapest bike is model " + cheapestModelNo);


        int modelChoice = sc.nextInt();

        if (modelChoice == 1) {
            System.out.println("Total cost of Model 1 is..." + bc.itemizeModel1()); // 7500
        } else if (modelChoice == 2) {
            System.out.println("Total cost of Model 2 is..." + bc.itemizeModel2()); //9800
        } else if ((modelChoice == 3)) {
            System.out.println("Total cost of Model 3 is..." + bc.itemizeModel3()); //7050
        }


        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        double TimeInSecond = (double) totalTime / 1000000000;
        System.out.println("total time execution is " + TimeInSecond);


    }

    public int getIndexOfLargest(int @NotNull [] array) {
        int largest = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[largest]) {
                largest = i;
            }
        }
        return largest;
    }

    public int getIndexOfMinimum(int @NotNull [] array) {
        int minimum = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minimum]) {
                minimum = i;
            }
        }
        return minimum;
    }
}
