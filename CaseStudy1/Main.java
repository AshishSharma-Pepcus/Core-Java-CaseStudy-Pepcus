package CaseStudy1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CompanyBase base = new CompanyBase();

        System.out.println("Welcome Administrator to the database");
        System.out.println("1. Add an Employee");
        System.out.println("2. Find an Employee");
        System.out.println("3. Remove an Employee");
        System.out.println("4. Exit the database");


        int input;
        do {
            System.out.println("Enter your choice: ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    base.setEmployee();
                    break;
                case 2:
                    base.find();
                    break;
                case 3:
                    base.removeEmployee();
                case 4:
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
        } while (input != 4);
    }
}
