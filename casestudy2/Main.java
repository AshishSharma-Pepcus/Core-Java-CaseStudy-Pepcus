package com.pepcus.training.casestudy2;

import java.util.Scanner;

public class Main {

    static Bicycle bc = new Bicycle();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Setting Price for various components");

        System.out.println("Set SteelFrame price: ");
        int steelFrame = sc.nextInt();
        System.out.println("Set FibreFrame price: ");
        int fibreFrame = sc.nextInt();
        System.out.println("Set Normal Breaks price: ");
        int normalBreaks = sc.nextInt();
        System.out.println("Set Disc breaks price: ");
        int discBreaks = sc.nextInt();
        System.out.println("Set Alloy wheels price: ");
        int alloyWheels = sc.nextInt();
        System.out.println("Set Spoke wheels price: ");
        int spokeWheels = sc.nextInt();
        System.out.println("Set Single Chain assembly price: ");
        int singleChainAssembly = sc.nextInt();
        System.out.println("Set Multiple chain assembly price: ");
        int multipleChainAssembly = sc.nextInt();
        System.out.println("Set Simple seat cover price");
        int simpleSeatCover = sc.nextInt();
        System.out.println("Set Fancy seat cover price");
        int fancySeatCover = sc.nextInt();
        System.out.println("Set Tube tyre price: ");
        int tubeTyre = sc.nextInt();
        System.out.println("Set Tubeless tyre price");
        int tubeLessTyre = sc.nextInt();

        if (steelFrame <= 0 || fibreFrame <= 0 || normalBreaks <= 0 || discBreaks <= 0 || alloyWheels <= 0 || spokeWheels <= 0
                || singleChainAssembly <= 0 || multipleChainAssembly <= 0 || simpleSeatCover <= 0 || fancySeatCover <= 0 ||
                tubeTyre <= 0 || tubeLessTyre <= 0) {
            throw new NegativeOrZeroInputException("You can't have negative pricing");
        } else {

            System.out.println("Choose your frame");
            System.out.println("1. Steel frame");
            System.out.println("2. Fibre frame");
            int inputFrame = sc.nextInt();
            customize(inputFrame, steelFrame, fibreFrame);


            System.out.println("Choose your breaks");
            System.out.println("1. Normal breaks");
            System.out.println("2. Disc breaks");
            int inputBreak = sc.nextInt();
            customize(inputBreak, normalBreaks, discBreaks);


            System.out.println("Choose your Wheels");
            System.out.println("1. Alloy wheels");
            System.out.println("2. Spoke wheels");
            int inputWheels = sc.nextInt();
            customize(inputWheels, alloyWheels, spokeWheels);


            System.out.println("Choose your chain assembly");
            System.out.println("1. Single");
            System.out.println("2. Multiple");
            int inputChain = sc.nextInt();
            customize(inputChain, singleChainAssembly, multipleChainAssembly);


            System.out.println("Choose your Seat Cover");
            System.out.println("1. Simple");
            System.out.println("2. Fancy");
            int inputSeat = sc.nextInt();
            customize(inputSeat, simpleSeatCover, fancySeatCover);


            System.out.println("Choose your tyre");
            System.out.println("1. Tube tyre");
            System.out.println("2. Tube-less tyre");
            int inputTyre = sc.nextInt();
            customize(inputTyre, tubeTyre, tubeLessTyre);


            System.out.println("Total price of Bicycle is: " + bc.getTotalPrice());

        }
    }

    public static void customize(int input, int component1Cost, int component2Cost) {
        if (input == 1) {
            System.out.println("Adding 1st Choice...");
            bc.addComponent(component1Cost);
        } else if (input == 2) {
            System.out.println("Adding 2nd choice...");
            bc.addComponent(component2Cost);
        } else {
            System.out.println("Wrong input");
        }
        bc.itemizeBicycle();
        bc.addComponent(0);
    }
}