package com.aor.refactoring.example3;

public class Percentage implements Discount{
    private final double value;

    public Percentage(double value){
        this.value=value;
    }

    public double apply(double price) {
        return price-price*value;
    }
}
