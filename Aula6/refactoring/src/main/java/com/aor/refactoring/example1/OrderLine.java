package com.aor.refactoring.example1;

public class OrderLine {
    private Product product;
    private int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String printOrderLine(){
        return product.getName() + "(x" + quantity + "): " + (product.getPrice() * quantity) + "\n";
    }

    public double calculatePrice(){
        return product.getPrice()*quantity;
    }
}
