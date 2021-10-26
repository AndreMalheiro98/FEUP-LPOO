package com.aor.refactoring.example3;

public class Fixed implements Discount{
    private final int value;

    public Fixed(int fixedDiscount){
        this.value=fixedDiscount;
    }

    public double apply(double price) {
        return (value > price ? 0 : price - value);
    }
}
