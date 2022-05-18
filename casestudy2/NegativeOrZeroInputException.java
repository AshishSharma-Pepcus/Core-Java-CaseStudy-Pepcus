package com.pepcus.training.casestudy2;

public class NegativeOrZeroInputException extends RuntimeException{
    NegativeOrZeroInputException(String msg){
        super(msg);
    }
}
