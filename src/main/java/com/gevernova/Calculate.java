package com.gevernova;

public class Calculate {
    public int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a,int b){
        if(b==0){
            throw new ArithmeticException("Cannot Divided By zero");
        }
        return a/b;
    }

}