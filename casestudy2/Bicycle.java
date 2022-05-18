package com.pepcus.training.casestudy2;

public class Bicycle {
    private int componentPrice;
    int totalPrice;

    public void addComponent(int price){
        this.componentPrice = price;
    }

    public void itemizeBicycle(){
        if(this.componentPrice>0){
            totalPrice += this.componentPrice;
        }
    }
    public int getTotalPrice(){
        return totalPrice;
    }
}


