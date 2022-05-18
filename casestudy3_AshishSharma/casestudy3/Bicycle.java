package com.pepcus.training.casestudy3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Bicycle {

    private int model1Price;
    private int model2Price;
    private int model3Price;
    private int steelFramePrice;
    private int fibreFramePrice;
    private int normalBreakPrice;
    private int discBreakPrice;
    private int alloyWheelsPrice;
    private int spokeWheelsPrice;
    private int singleChainAssemblyPrice;
    private int multipleChainAssemblyPrice;
    private int simpleSeatCoverPrice;
    private int fancySeatCoverPrice;
    private int tubeTyrePrice;
    private int tubeLessTyrePrice;


    FileInputStream fis;

    {
        try {
            fis = new FileInputStream("src/com/pepcus/training/casestudy3/configData.properties");
            Properties prop = new Properties();
            prop.load(fis);
            steelFramePrice = Integer.parseInt(prop.getProperty("steelFramePrice"));
            fibreFramePrice = Integer.parseInt(prop.getProperty("fibreFramePrice"));
            normalBreakPrice = Integer.parseInt(prop.getProperty("normalBreakPrice"));
            discBreakPrice = Integer.parseInt(prop.getProperty("discBreakPrice"));
            alloyWheelsPrice = Integer.parseInt(prop.getProperty("alloyWheelsPrice"));
            spokeWheelsPrice = Integer.parseInt(prop.getProperty("spokeWheelsPrice"));
            singleChainAssemblyPrice = Integer.parseInt(prop.getProperty("singleChainAssemblyPrice"));
            multipleChainAssemblyPrice = Integer.parseInt(prop.getProperty("multipleChainAssemblyPrice"));
            simpleSeatCoverPrice = Integer.parseInt(prop.getProperty("simpleSeatCoverPrice"));
            fancySeatCoverPrice = Integer.parseInt(prop.getProperty("fancySeatCoverPrice"));
            tubeTyrePrice = Integer.parseInt(prop.getProperty("tubeTyrePrice"));
            tubeLessTyrePrice = Integer.parseInt(prop.getProperty("tubeLessTyrePrice"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int itemizeModel1() {

        model1Price = steelFramePrice + discBreakPrice + alloyWheelsPrice + singleChainAssemblyPrice +
                fancySeatCoverPrice + tubeTyrePrice;
        return model1Price;
    }

    public int itemizeModel2() {

        model2Price = fibreFramePrice + discBreakPrice + spokeWheelsPrice + multipleChainAssemblyPrice +
                fancySeatCoverPrice + tubeLessTyrePrice;
        return model2Price;
    }

    public int itemizeModel3() {

        model3Price = steelFramePrice + normalBreakPrice + spokeWheelsPrice + multipleChainAssemblyPrice +
                simpleSeatCoverPrice + tubeTyrePrice;
        return model3Price;
    }

    public int getModel1Price() {
        return model1Price;
    }

    public int getModel2Price() {
        return model2Price;
    }

    public int getModel3Price() {
        return model3Price;
    }




}


