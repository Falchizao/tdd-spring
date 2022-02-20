package com.example.testdrivendevelopment.model;

public class Comission {

    public double calcular(Double value){
        return value <= 1000.0 ? value * 0.1 : value * 0.15;
    }
    
}
