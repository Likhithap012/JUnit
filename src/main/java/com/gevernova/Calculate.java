package com.gevernova;

public class Calculate {
    public int add(int numOne, int numTwo){
        int sum= numOne + numTwo;
        return sum;
    }
    public int sub(int numOne, int numTwo){
        return numOne - numTwo;
    }
    public int multiply(int numbOne, int numTwo){
        return numbOne * numTwo;
    }
    public int divide(int numOne, int numTwo){
        if(numTwo ==0){
            throw new ArithmeticException("Cannot Divided By zero");
        }
        return numOne / numTwo;
    }

}