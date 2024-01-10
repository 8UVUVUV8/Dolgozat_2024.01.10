package com.example;

public class Romb {
    public Double calcArea(Double side, Double alpha){
        Double sideSqrt = Math.pow(side, 2);
        Double alpSin = Math.sin(Math.toRadians(alpha));
        Double result = sideSqrt*alpSin;
        return result;
    }
}
