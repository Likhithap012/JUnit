package com.gevernova;

public class ExceptionalHandling {
    public int divide(int numOne, int numTwo){
        if(numTwo ==0){
            throw new ArithmeticException("Cannot Be Divided by zero");
        }
        return numOne / numTwo;
    }
}
