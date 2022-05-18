package com.pepcus.training.casestudy3;

import java.io.*;
public class parsedCsv {
    int totalModels = 0;
    public void printCsv() {
        String path = "src\\com\\pepcus\\training\\casestudy3\\SampleCSV.csv";
        String line = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                totalModels++;
                String[] row = line.split(",");
                for (String index : row) {
                    System.out.printf("%-10s", index);

                }
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
