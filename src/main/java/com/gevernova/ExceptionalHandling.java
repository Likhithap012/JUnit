package com.gevernova;

public class ExceptionalHandling {
    public int divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Cannot Be Divided by zero");
        }
        return a/b;
    }
}
