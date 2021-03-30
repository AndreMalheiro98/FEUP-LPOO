package com.aor.refactoring.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines;

    public Order() {
        lines = new ArrayList<>();
    }

    public void add(Product product, int quantity) {
        lines.add(new OrderLine(product, quantity));
    }

    public boolean isElegibleForFreeDelivery() {
        if (getOrderPrice() > 100) return true;
        else return false;
    }

    public String printOrder() {
        StringBuffer printBuffer = new StringBuffer();

        for (OrderLine line : lines)
            printBuffer.append(line.printOrderLine());

        printBuffer.append("Total: " + this.getOrderPrice());

        return printBuffer.toString();
    }

    public double getOrderPrice(){
        double total = 0;

        for (OrderLine line : lines)
            total += line.calculatePrice();

        return total;
    }

}