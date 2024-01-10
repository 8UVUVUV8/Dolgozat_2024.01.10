package com.example;

public class Romb {
    public Double calcArea(Double side, Double alpha){
        if (side <= 0.0 || alpha <=0.0) {
            throw new IllegalArgumentException();  
        }
        if (alpha>=180) {
            throw new IllegalArgumentException();
        }
        Double sideSqrt = Math.pow(side, 2);
        Double alpSin = Math.sin(Math.toRadians(alpha));
        Double result = sideSqrt*alpSin;
        return result;
    }
}
